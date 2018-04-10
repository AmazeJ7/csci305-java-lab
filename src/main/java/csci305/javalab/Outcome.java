package csci305.javalab;

/**
 * Element class
 *
 * @author Johnny Gaddis
 */

public class Outcome {

    private String text; // Store the text of an outcome
    private String result; // Store a win, loss, or tie

    public Outcome(String text, String result) {
        this.text = text;
        this.result = result;
    }

    // Method to get outcome text
    public String getText() {
        return text;
    }

    // Method to get result text
    public String getResult() {
        return result;
    }
}
