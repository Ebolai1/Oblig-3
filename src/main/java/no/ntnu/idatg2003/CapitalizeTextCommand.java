package no.ntnu.idatg2003;

import java.util.Objects;
public class CapitalizeTextCommand implements TextCommand {

    /**
     * A command that capitalizes the first character of the text.
     */

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text,"Can't be null");
        if(text.isEmpty()) return text;

        char first =  text.charAt(0);
        char upper = Character.toUpperCase(first);

        if (text.length() == 1) return String.valueOf(upper);
        return upper + text.substring(1);
    }
}
