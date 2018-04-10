package csci305.javalab;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

/**
 * Main class to run the command prompt gui.
 *
 * @author Johnny Gaddis
 */

public class Main {

    private static Scanner in = new Scanner(System.in); // Scanner for user input
    public static final Map<String, Element> moves; // Hash table for all moves

    // Static method to assign hash values
    static {
        moves = new HashMap<>();
        moves.put("Rock", new Rock());
        moves.put("Paper", new Paper());
        moves.put("Scissors", new Scissors());
        moves.put("Lizard", new Lizard());
        moves.put("Spock", new Spock());
    }

    // Method to choose players 1 and 2
    public static Player choosePlayer(int i) {
        int input = 0;
        while (true) {
            System.out.print("Select player " + i + ": ");
            try {
                input = in.nextInt();
                if (input > 0 && input < 7) {
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                in.next();
            }
            ;
            System.out.println("Invalid player. Please try again.");
        }
        switch (input) {
            case 1:
                return new Human();
            case 2:
                return new StupidBot();
            case 3:
                return new RandomBot();
            case 4:
                return new IterativeBot();
            case 5:
                return new LastPlayBot();
            case 6:
                return new MyBot();
            default:
                return new RandomBot();
        }
    }

    // Main method to be run on program start
    public static void main(String[] args) {
        int p1w = 0;
        int p2w = 0;
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Johnny Gaddis");
        System.out.println("\nPlease choose two players");
        System.out.println("   (1) Human");
        System.out.println("   (2) StupidBot");
        System.out.println("   (3) RandomBot");
        System.out.println("   (4) IterativeBot");
        System.out.println("   (5) LastPlayBot");
        System.out.println("   (6) MyBot\n");
        Player p1 = choosePlayer(1);
        Player p2 = choosePlayer(2);
        System.out.println("\n" + p1.getName() + " vs " + p2.getName() + ". Go!");
        for (int i = 0; i < 5; i++) {
            Element e1 = p1.play();
            Element e2 = p2.play();
            if (p1.getName().equals("LastPlayBot")) {
                p1.lastPlay(e2);
            } else if (p1.getName().equals("MyBot")) {
                p1.lastPlay(e2);
            }
            if (p2.getName().equals("LastPlayBot")) {
                p2.lastPlay(e1);
            } else if (p2.getName().equals("MyBot")) {
                p2.lastPlay(e1);
            }
            System.out.println("\nRound " + (i + 1) + ":");
            System.out.println("  Player 1 chose " + e1.getName());
            System.out.println("  Player 2 chose " + e2.getName());
            Outcome o = e1.compareTo(e2);
            System.out.println("  " + o.getText());
            if (o.getResult().equals("Tie")) {
                System.out.println("  Round was a tie");
            } else if (o.getResult().equals("Win")) {
                System.out.println("  Player 1 won the round");
                p1w++;
            } else if (o.getResult().equals("Lose")) {
                System.out.println("  Player 2 won the round");
                p2w++;
            }
        }
        System.out.println("\nThe score is " + p1w + " to " + p2w + ".");
        if (p1w == p2w) {
            System.out.println("Game was a tie");
        } else if (p1w > p2w) {
            System.out.println("Player 1 won the game");
            p1w++;
        } else if (p2w > p1w) {
            System.out.println("Player 2 won the game");
            p2w++;
        }
    }
}
