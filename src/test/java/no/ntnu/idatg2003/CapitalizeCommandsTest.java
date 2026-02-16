package no.ntnu.idatg2003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeCommandsTest {

    @Test
    void capitalizeTextCommand_capitalizesFirstChar() {
        var cmd = new CapitalizeTextCommand();
        assertEquals("Text to be capitalized", cmd.execute("text to be capitalized"));
    }

    @Test
    void capitalizeWordsTextCommand_capitalizesEachWord() {
        var cmd = new CapitalizeWordsTextCommand();
        assertEquals("Text To Be Capitalized", cmd.execute("text to be capitalized"));
    }

    @Test
    void capitalizeSelectionTextCommand_capitalizesSelectionEveryTime() {
        var cmd = new CapitalizeSelectionTextCommand("selection");
        assertEquals("text with Selection and another Selection",
                cmd.execute("text with selection and another selection"));
    }
}