package no.ntnu.idatg2003;
import java.util.Objects;

public class WrapTextCommand implements TextCommand {
    private final String opening;
    private final String end;

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
