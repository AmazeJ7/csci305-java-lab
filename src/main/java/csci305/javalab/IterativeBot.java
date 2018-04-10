package csci305.javalab;

/**
 * IterativeBot class. Plays the next element in the game starting with Rock.
 *
 * @author Johnny Gaddis
 */

public class IterativeBot extends Player {

    private int i = 0; // Integer to represent the iteration through the moves

    public IterativeBot() {
        super("IterativeBot");
    }

    @Override
    public Element play() {
        String name = "";
        if (i > 4) {
            i = 0;
        }
        if (i == 0) {
            name = "Rock";
        } else if (i == 1) {
            name = "Paper";
        } else if (i == 2) {
            name = "Scissors";
        } else if (i == 3) {
            name = "Lizard";
        } else if (i == 4) {
            name = "Spock";
        }
        i++;
        return Main.moves.get(name);
    }
}
