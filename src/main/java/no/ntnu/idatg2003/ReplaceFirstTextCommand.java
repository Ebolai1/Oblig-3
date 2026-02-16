package no.ntnu.idatg2003;

import java.util.Objects;
import java.util.regex.Pattern;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text, "text kan ikke være null");
        return text.replaceFirst(Pattern.quote(getTarget()), getReplacement());
    }
}