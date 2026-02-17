package no.ntnu.idatg2003;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 * A command that replaces only the first occurrence of the target string.
 *
 * This class extends ReplaceTextCommand and overrides the execute method.
 */
public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    /**
     * Constructs a ReplaceFirstTextCommand.
     *
     * @param target the text to replace
     * @param replacement the replacement text
     */

    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text, "text kan ikke være null");
        return text.replaceFirst(Pattern.quote(getTarget()), getReplacement());
    }
}