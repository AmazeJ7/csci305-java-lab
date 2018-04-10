package main.java.csci305.javalab;

/**
 * Scissors move class
 * @author Johnny Gaddis
 */

public class Scissors extends Element{
  public Scissors(String name){
    super(name);
  }

  @Override
  public Outcome compareTo(Element e){
    switch (e.getName()){
      case "Rock": return new Outcome("Rock crushes Scissors", "Lose");
      case "Paper": return new Outcome("Scissors cut Paper", "Win");
      case "Scissors": return new Outcome("Scissors equals Scissors", "Tie");
      case "Lizard": return new Outcome("Scissors decapitate Lizard", "Win");
      case "Spock": return new Outcome("Spock smashes Scissors", "Lose");
      default: return new Outcome("", "");
    }
  }
}
