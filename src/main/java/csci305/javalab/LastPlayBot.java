package csci305.javalab;

/**
 * LastPlayBot class. Plays what the other player played last.
 *
 * @author Johnny Gaddis
 */

public class LastPlayBot extends Player {

    private Element last; // Element to keep track of the last played move

    public LastPlayBot() {
        super("LastPlayBot");
    }

    @Override
    public void lastPlay(Element e) {
        last = e;
    }

    @Override
    public Element play() {
        if (last == null) {
            return new RandomBot().play();
        } else {
            return last;
        }
    }
}
