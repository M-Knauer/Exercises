package Desafios.LambdaExpression.UpperAndLowercase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>(List.of("Muscle", "wits", "DEXTERITY", "InteLliGencE"));

        str.replaceAll(s -> s.toUpperCase());
        System.out.println("Uppercase: "+str);

        str.replaceAll(s -> s.toLowerCase());
        System.out.println("Lowercase: "+str);

        str.replaceAll(s -> {
            if (s != null && !s.trim().isEmpty()){
                s = s.trim();
                s = Character.toTitleCase(s.charAt(0)) + s.substring(1);
            }
            return s;
        });
        System.out.println("Title case: "+str);

    }
}
