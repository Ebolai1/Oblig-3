package no.ntnu.idatg2003;

import java.util.Objects;

/**
 * A command that replaces all occurrences of a target string with a replacement string.
 */

public class ReplaceTextCommand implements TextCommand {
    private final String target;
    private final String replacement;

    /**
     * Constructs a ReplaceTextCommand.
     *
     * @param target the text to replace (must not be null or empty)
     * @param replacement the replacement text (must not be null)
     * @throws IllegalArgumentException if target is null or empty
     * @throws NullPointerException if replacement is null
     */

    public ReplaceTextCommand(String target, String replacement) {
        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException("Text can't be null or empty");
        }
        this.target = target;
        this.replacement = Objects.requireNonNull(replacement, "Replacement can't be null");
    }

     public String execute(String text) {
        Objects.requireNonNull(text, "Text can't be null");
        return text.replace(target, replacement);
     }

     public String getTarget() {
        return target;
     }

     public String getReplacement() {
        return replacement;
     }
}