package no.ntnu.idatg2003;


/**
 * Represents a command that transforms a text string.
 *
 * All text command classes must implement this interface and provide
 * an implementation of the execute method.
 */
public interface TextCommand {
    /**
     * Executes the command on the given input text.
     *
     * @param text the input text to transform (must not be null)
     * @return the transformed text
     * @throws NullPointerException if text is null
     */
    String execute(String text);
}