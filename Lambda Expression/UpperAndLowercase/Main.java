package Desafios.LambdaExpression.UpperAndLowercase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>(List.of("Muscle", "Wits", "Dexterity", "Intelligence"));

        str.replaceAll(s -> s.toUpperCase());
        System.out.println("Uppercase: "+str);

        str.replaceAll(s -> s.toLowerCase());
        System.out.println("Lowercase: "+str);

    }
}
