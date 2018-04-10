package main.java.csci305.javalab;

/**
 * Lizard move class
 * @author Johnny Gaddis
 */

public class Lizard extends Element{

  public Lizard(){
    super("Lizard");
  }

  @Override
  public Outcome compareTo(Element e){
    switch (e.getName()){
      case "Rock": return new Outcome("Rock crushes Lizard", "Lose");
      case "Paper": return new Outcome("Lizard eats Paper", "Win");
      case "Scissors": return new Outcome("Scissors decapitate Lizard", "Lose");
      case "Lizard": return new Outcome("Lizard equals Lizard", "Tie");
      case "Spock": return new Outcome("Lizard poisons Spock", "Win");
      default: return new Outcome("", "");
    }
  }
}
