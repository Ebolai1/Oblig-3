package no.ntnu.idatg2003;

import java.util.Objects;


/**
 * A command that capitalizes the first letter of each word.
 */

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text,"Can't be null");
        if (text.isEmpty()) return text;

        StringBuilder sb = new StringBuilder();
        boolean startOfWord = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c) && startOfWord) {
                sb.append(Character.toUpperCase(c));
                startOfWord = false;
            } else {
                sb.append(c);
                if (!Character.isLetter(c)) {
                    startOfWord = true;
                }
            }
        }

        return sb.toString();
    }

}
