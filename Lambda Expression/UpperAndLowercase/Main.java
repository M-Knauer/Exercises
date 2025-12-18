package Desafios.LambdaExpression.UpperAndLowercase;

import Desafios.LambdaExpression.UpperAndLowercase.Models.InUpperAndLowercase;
import Desafios.LambdaExpression.UpperAndLowercase.Models.UpperAndLowercase;

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

        InUpperAndLowercase upperLower = strings -> {
            List<String> upper = new ArrayList<>();
            List<String> lower = new ArrayList<>();
            for (String s : strings) {
                upper.add(s.toUpperCase());
                lower.add(s.toLowerCase());
            }
            return new UpperAndLowercase(upper, lower);
        };

        UpperAndLowercase ul = upperLower.getUpperLower(str);
        System.out.println("Uppercase: "+ul.getUppercases());
        System.out.println("Lowercase: "+ul.getLowercases());
    }
}
