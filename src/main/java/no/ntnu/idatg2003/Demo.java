package no.ntnu.idatg2003;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Script script = new Script(List.of(
                new WrapTextCommand("<p>", "</p>"),
                new CapitalizeTextCommand()
        ));

        System.out.println(script.execute("hello world"));
    }
}