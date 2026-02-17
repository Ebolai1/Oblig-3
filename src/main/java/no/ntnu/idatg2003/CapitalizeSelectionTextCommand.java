package no.ntnu.idatg2003;

import java.util.Objects;


/**
 * A command that capitalizes all occurrences of a selected substring.
 */

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private final String selection;

    /**
     * Constructs a CapitalizeSelectionTextCommand.
     *
     * @param selection the text to capitalize
     * @throws IllegalArgumentException if selection is null or empty
     */

    public CapitalizeSelectionTextCommand(String selection) {
    if (selection == null || selection.isEmpty()) throw new IllegalArgumentException("Selection cannot be null or empty");
    this.selection = selection;
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text, "Text cannot be null");
        String cap = super.execute(selection);
        return text.replace(selection, cap);
    }

    public String getSelection() {
        return selection;
    }

}
