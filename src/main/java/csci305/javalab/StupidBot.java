package main.java.csci305.javalab;

/**
 * StupidBot class
 * @author Johnny Gaddis
 */

public class StupidBot extends Player{

  public StupidBot(){
    super("StupidBot");
  }

  @Override
  public Element Play(){
    return new Rock();
  }
}
