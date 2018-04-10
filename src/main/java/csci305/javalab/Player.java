package main.java.csci305.javalab;

/**
 * Human player class
 * @author Johnny Gaddis
 */

public abstract class Player{

  private String name;

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public abstract Element Play(){
    return new Element("", "");
  }
}
