package main.java.csci305.javalab;

/**
 * StupidBot class
 * @author Johnny Gaddis
 */

public class RandomBot extends Player{

  public RandomBot(){
    super("RandomBot");
  }

  @Override
  public Element Play(){
    return moves[(int)(Math.random()*5)];
  }
}
