package csci305.javalab;

/**
 * Human player class
 *
 * @author Johnny Gaddis
 */

public abstract class Player {

    private String name; // Name representation

    public Player(String name) {
        this.name = name;
    }

    // Method to get a players name
    public String getName() {
        return name;
    }

    // Method to choose the next move
    public abstract Element play();

    // Method to store the opponents last move
    public abstract void lastPlay(Element e);
}
