package no.ntnu.idatg2003;

import java.util.Objects;

public class WrapLinesTextCommand extends WrapTextCommand {
    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text,"Can't be null");

        String[] lines = text.split("\n", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            sb.append(super.execute(lines[i]));
            if (i < lines.length - 1) {
                sb.append("\n");
            }

        }
        return sb.toString();
}
}
