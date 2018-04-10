package main.java.csci305.javalab;

/**
 * Element class
 * @author Johnny Gaddis
 */

public class Outcome{

  private String text;
  private String result;

  public Outcome(String text, String result){
    this.text = text;
    this.result = result;
  }

  @Override
  public String toString(){
    return text;
  }
}
