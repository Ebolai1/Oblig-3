package no.ntnu.idatg2003;

/**
 * Felles grensesnitt for tekstkommandoer.
 */
public interface TextCommand {
    /**
     * Utfører kommandoen på input-tekst og returnerer resultatet.
     * @param text input-tekst
     * @return transformert tekst
     */
    String execute(String text);
}