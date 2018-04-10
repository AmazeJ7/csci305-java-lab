package main.java.csci305.javalab;

/**
 * StupidBot class
 * @author Johnny Gaddis
 */

public class IterativeBot extends Player{

  private int i = 0;

  public IterativeBot(){
    super("IterativeBot");
  }

  @Override
  public Element Play(Map m){
    if(i > 4){
      i = 0;
    }
    return moves[i];
  }
}
