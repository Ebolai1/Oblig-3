package no.ntnu.idatg2003;

import java.util.List;
import java.util.Objects;

public class Script {
    private final List<TextCommand> commands;

    public  Script(List<TextCommand> commands) {
        this.commands = List.copyOf(Objects.requireNonNull(commands, "Commands cannot be null"));

        if (this.commands.stream().anyMatch(Objects::isNull)) {
      throw new IllegalArgumentException("Commands cannot be null");
        }

    }

    public String execute(String text) {
        Objects.requireNonNull(text, "Text cannot be null");
        String result = text;
        for (TextCommand cmd : commands) {
            result = cmd.execute(result);
        }
        return result;
    }

    public List<TextCommand> getCommands() {
        return commands;
    }
}
