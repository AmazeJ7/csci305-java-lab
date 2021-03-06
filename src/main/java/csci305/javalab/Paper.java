package csci305.javalab;

/**
 * Paper move class
 *
 * @author Johnny Gaddis
 */

public class Paper extends Element {

    public Paper() {
        super("Paper");
    }

    @Override
    public Outcome compareTo(Element e) {
        switch (e.getName()) {
            case "Rock":
                return new Outcome("Paper covers Rock", "Win");
            case "Paper":
                return new Outcome("Paper equals Paper", "Tie");
            case "Scissors":
                return new Outcome("Scissors cuts Paper", "Lose");
            case "Lizard":
                return new Outcome("Lizard eats Paper", "Lose");
            case "Spock":
                return new Outcome("Paper disproves Spock", "Win");
            default:
                return new Outcome("", "");
        }
    }
}
