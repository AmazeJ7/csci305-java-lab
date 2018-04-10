package main.java.csci305.javalab;

/**
 * StupidBot class
 * @author Johnny Gaddis
 */

public class StupidBot extends Player{

  public StupidBot(String name){
    super(name);
  }

  @Override
  public Element Play(){
    return new Rock();
  }
}
