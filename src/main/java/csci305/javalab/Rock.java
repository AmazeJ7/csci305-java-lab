package main.java.csci305.javalab;

/**
 * Rock move class
 * @author Johnny Gaddis
 */

public class Rock extends Element{
  public Rock(String name){
    super(name);
  }

  @Override
  public Outcome compareTo(Element e){
    switch (e.getName()){
      case "Rock": return new Outcome("Rock equals Rock", "Tie");
      case "Paper": return new Outcome("Paper covers Rock", "Lose");
      case "Scissors": return new Outcome("Rock crushes Scissors", "Win");
      case "Lizard": return new Outcome("Rock crushes Lizard", "Win");
      case "Spock": return new Outcome("Spock vaporizes Rock", "Lose");
      default: return new Outcome("", "");
    }
  }
}
