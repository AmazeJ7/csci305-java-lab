package main.java.csci305.javalab;

/**
 * Element class
 * @author Johnny Gaddis
 */

public abstract class Element {

  private String name;

  public Element(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public abstract Outcome compareTo(Element e);
}
