package main.java.csci305.javalab;

import java.util.Scanner;

/**
 * Human player class
 * @author Johnny Gaddis
 */

public class Human extends Player{

  public Human(){
    super("Human");
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
        line = in.nextInt();
          if(0 < input && input < 6){
            n = line;
            break;
          }
      }catch(InputMismatchException e){
        in.next();
      }
      System.out.println("Invalid move. Please try again.");
    }
    switch(n){
      case 1: return new Rock();
      case 2: return new Paper();
      case 3: return new Scissors();
      case 4: return new Lizzard();
      case 5: return new Spock();
      default: return null;
    }
  }
}
