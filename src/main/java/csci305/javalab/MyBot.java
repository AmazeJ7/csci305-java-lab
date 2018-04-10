package csci305.javalab;

/**
 * MyBot class. Plays against the opponents subconscious need to play in order.
 *
 * @author Johnny Gaddis
 */

public class MyBot extends Player {

    private Element last; // Element to keep track of the last element

    public MyBot() {
        super("MyBot");
    }

    @Override
    public void lastPlay(Element e) {
        last = e;
    }

    @Override
    public Element play() {
        if (last == null) {
            return Main.moves.get("Paper");
        }
        String name = last.getName();
        if (name.equals("Rock")) {
            return Main.moves.get("Scissors");
        } else if (name.equals("Paper")) {
            return Main.moves.get("Rock");
        } else if (name.equals("Scissors")) {
            return Main.moves.get("Paper");
        } else if (name.equals("Lizard")) {
            return Main.moves.get("Paper");
        } else if (name.equals("Spock")) {
            return Main.moves.get("Paper");
        }
        return null;
    }
}
