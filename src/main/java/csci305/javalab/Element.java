package csci305.javalab;

/**
 * Element class. Represents all possible elements in the game.
 *
 * @author Johnny Gaddis
 */

public abstract class Element {

    private String name; // Variable to store the name of the element

    public Element(String name) {
        this.name = name;
    }

    // Method to get the name of an element
    public String getName() {
        return name;
    }

    // Method to receive the outcome of a round
    public abstract Outcome compareTo(Element e);
}
