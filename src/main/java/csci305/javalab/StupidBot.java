package csci305.javalab;

/**
 * StupidBot class. Always Plays Rock.
 *
 * @author Johnny Gaddis
 */

public class StupidBot extends Player {

    public StupidBot() {
        super("StupidBot");
    }

    @Override
    public void lastPlay(Element e) {
    }

    @Override
    public Element play() {
        return new Rock();
    }
}
