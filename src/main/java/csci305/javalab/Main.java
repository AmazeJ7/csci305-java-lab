package main.java.csci305.javalab;

import java.util.Scanner;
import java.util.Map;

/**
 * Main class
 * @author Johnny Gaddis
 */

public class Main{

  public static final Map<String, Element> moves = Map.of(
    "Rock", Rock(),
    "Paper", Paper(),
    "Scissors", Scissors(),
    "Lizard", Lizard(),
    "Spock", Spock()
  );

  // main method
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
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
    System.out.println("\n"+p1.getName()+" vs "+p2.getName()+". Go!");
    for(int i = 0; i < 5; i++){
      Element e1 = p1.play();
      Element e2 = p2.play();
      if(p1.getName() == "LastPlayBot"){
        p1.lastPlay(e2);
      }
      if(p2.getName() == "LastPlayBot"){
        p2.lastPlay(e1);
      }
      System.out.println("\nRound "+i+":");
      System.out.println("  Player 1 chose "+e1.getName());
      System.out.println("  Player 2 chose "+e2.getName());
      Outcome o = e1.compareTo(e2);
      System.out.println("  "+o.getText());
      if(o.getResult() == "Tie"){
        println("Round was a tie");
      }else if(o.getResult() == "Win"){
        println("Player 1 won the round");
        p1w++;
      }else if(o.getResult() == "Lose"){
        println("Player 2 won the round");
        p2w++;
      }
    }
    System.out.println("\nThe score is "+p1w+" to "+p2w".");
    if(p1w == p2w){
      println("Game was a tie");
    }else if(p1w > p2w){
      println("Player 1 won the game");
      p1w++;
    }else if(p2w > p1w){
      println("Player 2 won the game");
      p2w++;
    }
  }

  // Method to choose players
  public static Player choosePlayer(int i){
    int input = 0;
    while(true){
      System.out.println("Select player "+i+": ");
        try{
          input = in.nextInt();
          if(input > 0 && input < 7){
            break;
          }
        } catch (java.util.InputMismatchException e){
          in.next();
        };
        System.out.println("Invalid player. Please try again.");
    }
    switch(input){
      case 1:
        System.out.println("Enter you name: ");
        return new Human(in.next()); break;
      case 2: return new StupidBot(); break;
      case 3: return new RandomBot(); break;
      case 4: return new IterativeBot(); break;
      case 5: return new LastPlayBot(); break;
      case 6: return new MyBot(); break;
      default: return new RandomBot(); break;
    }
  }
}
