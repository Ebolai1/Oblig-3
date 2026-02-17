package no.ntnu.idatg2003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapCommandsTest {

    @Test
    void wrapTextCommand_wrapsText() {
        var cmd = new WrapTextCommand("<p>", "</p>");
        assertEquals("<p>text</p>", cmd.execute("text"));
    }

    @Test
    void wrapLinesTextCommand_wrapsEachLine() {
        var cmd = new WrapLinesTextCommand("<p>", "</p>");
        assertEquals("<p>first</p>\n<p>second</p>",
                cmd.execute("first\nsecond"));
    }

    @Test
    void wrapSelectionTextCommand_wrapsSelection() {
        var cmd = new WrapSelectionTextCommand("<p>", "</p>", "selection");
        assertEquals("text with <p>selection</p>",
                cmd.execute("text with selection"));
    }
}