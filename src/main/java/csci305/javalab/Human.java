package main.java.csci305.javalab;

import java.util.Scanner;

/**
 * Human player class
 * @author Johnny Gaddis
 */

public class Human extends Player{

  public Player(String name){
    super(name);
  }

  @Override
  public Element Play(){
    Scanner in = new Scanner(System.in);
    int n = 0;
    System.out.println();
    System.out.println("(1) : Rock");
    System.out.println("(2) : Paper");
    System.out.println("(3) : Scissors");
    System.out.println("(4) : Lizard");
    System.out.println("(5) : Spock");
    while(true){
      try{
        System.out.print("Enter your move: ");
        input = in.nextInt();
          if(0 < input && input < 6){
                break;
            }
      }catch(InputMismatchException e){
        in.next();
      }
      System.out.println("Invalid move. Please try again.");
    }

    switch(input){
      case 1:
        choice = Driver.moves.get("Rock");
        break;
      case 2:
        choice = Driver.moves.get("Paper");
        break;
      case 3:
        choice = Driver.moves.get("Scissors");
        break;
      case 4:
        choice = Driver.moves.get("Lizard");
        break;
      case 5:
        choice = Driver.moves.get("Spock");
        break;
      default:
        break;
    }

    return choice;
    }
  }
}
