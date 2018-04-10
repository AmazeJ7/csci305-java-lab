package main.java.csci305.javalab;

/**
 * StupidBot class
 * @author Johnny Gaddis
 */

public class LastPlayBot extends Player{

  private Element last;

  public LastPlayBot(){
    super("LastPlayBot");
  }

  public lastPlay(Element e){
    last = e;
  }

  @Override
  public Element Play(){
    if(last == null){
      return new RandomBot().play();
    } else {
      return last;
    }
  }
}
