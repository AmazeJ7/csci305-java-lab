package csci305.javalab;

/**
 * RandomBot class. Plays a random move.
 *
 * @author Johnny Gaddis
 */

public class RandomBot extends Player {

    public RandomBot() {
        super("RandomBot");
    }

    @Override
    public void lastPlay(Element e) {
    }

    @Override
    public Element play() {
        String name = "";
        int i = (int) (Math.random() * 5);
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
        return Main.moves.get(name);
    }
}
