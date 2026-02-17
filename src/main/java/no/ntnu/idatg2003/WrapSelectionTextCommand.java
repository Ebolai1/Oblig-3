package no.ntnu.idatg2003;

import java.util.Objects;

public class WrapSelectionTextCommand extends WrapTextCommand {
    private final String selection;

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
