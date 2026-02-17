package no.ntnu.idatg2003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceCommandsTest {

    @Test
    void replaceTextCommand_replacesAll() {
        var cmd = new ReplaceTextCommand("target", "replacement");
        assertEquals("text with replacement and replacement",
                cmd.execute("text with target and target"));
    }

    @Test
    void replaceFirstTextCommand_replacesOnlyFirst() {
        var cmd = new ReplaceFirstTextCommand("target", "replacement");
        assertEquals("text with replacement and target",
                cmd.execute("text with target and target"));
    }

    @Test
    void replaceTextCommand_throwsOnEmptyTarget() {
        assertThrows(IllegalArgumentException.class, () -> new ReplaceTextCommand("", "x"));
    }

    @Test
    void execute_throwsOnNullText() {
        var cmd = new ReplaceTextCommand("a", "b");
        assertThrows(NullPointerException.class, () -> cmd.execute(null));
    }
}