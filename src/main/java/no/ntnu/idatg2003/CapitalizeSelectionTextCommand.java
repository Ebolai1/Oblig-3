package no.ntnu.idatg2003;

import java.util.Objects;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private final String selection;

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
