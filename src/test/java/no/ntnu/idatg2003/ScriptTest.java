package no.ntnu.idatg2003;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScriptTest {

    @Test
    void script_runsCommandsInOrder() {
        var script = new Script(List.of(
                new ReplaceTextCommand("hello", "hi"),
                new CapitalizeTextCommand()
        ));

        assertEquals("Hi world", script.execute("hello world"));
    }
}