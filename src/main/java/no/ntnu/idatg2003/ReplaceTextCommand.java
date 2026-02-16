package no.ntnu.idatg2003;

import java.util.Objects;

public class ReplaceTextCommand implements TextCommand {
    private final String target;
    private final String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException("Teksten kan ikke være null eller tomt";
        }
        this.target = target;
        this.replacement = Objects.requireNonNull(replacement, "replacement kan ikke være null");
    }

     public String execute(String text) {
        Objects.requireNonNull(text, "text kan ikke være null");
        return text.replace(target, replacement);
     }

     public String getTarget() {
        return target;
     }

     public String getReplacement() {
        return replacement;
     }
}