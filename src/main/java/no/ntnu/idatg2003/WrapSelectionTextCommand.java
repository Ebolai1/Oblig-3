package no.ntnu.idatg2003;

import java.util.Objects;


/**
 * A command that wraps all occurrences of a selected substring.
 */

public class WrapSelectionTextCommand extends WrapTextCommand {
    private final String selection;

    /**
     * Constructs a WrapSelectionTextCommand.
     *
     * @param opening the opening string
     * @param end the closing string
     * @param selection the text to wrap
     * @throws IllegalArgumentException if selection is null or empty
     */

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        if (selection == null || selection.isEmpty()) {
            throw new IllegalArgumentException("selection is null or empty");
        }
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text, "Text can't be null");
        return text.replace(selection, super.execute(selection));
    }

    public String getSelection() {
        return selection;
    }
}
