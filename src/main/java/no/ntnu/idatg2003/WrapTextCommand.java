package no.ntnu.idatg2003;
import java.util.Objects;

/**
 * A command that wraps text with a given opening and closing string.
 */

public class WrapTextCommand implements TextCommand {
    private final String opening;
    private final String end;


    /**
     * Constructs a WrapTextCommand.
     *
     * @param opening the opening string
     * @param end the closing string
     * @throws NullPointerException if opening or end is null
     */

    public WrapTextCommand(String opening, String end) {
        this.opening = Objects.requireNonNull(opening, "Kan ikke være null");
        this.end = Objects.requireNonNull(end, "end kan ikke være 0");
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text, "text kan ikke være 0");
        return opening + text + end;
    }

    public String getOpening() {
        return opening;
    }
    public String getEnd() {
        return end;
    }
}
