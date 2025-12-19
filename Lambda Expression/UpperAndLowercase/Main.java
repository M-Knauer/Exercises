package Desafios.LambdaExpression.UpperAndLowercase;

import Desafios.LambdaExpression.UpperAndLowercase.Models.InUpperAndLowercase;
import Desafios.LambdaExpression.UpperAndLowercase.Models.MixUpperAndLowercase;
import Desafios.LambdaExpression.UpperAndLowercase.Models.UpperAndLowercase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

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

        MixUpperAndLowercase mix = strings -> {
            List<String> mixedLst = new ArrayList<>();
            for (String string : strings) {
                if (string != null) {
                    StringBuilder mixedWord = new StringBuilder();
                    for (int i = 0; i < string.length(); i++) {
                        char chr = string.charAt(i);
                        if (i % 2 == 0) {
                            mixedWord.append(Character.toUpperCase(chr));
                        } else {
                            mixedWord.append(Character.toLowerCase(chr));
                        }
                    }
                    mixedLst.add(mixedWord.toString());
                }
            }
            return mixedLst;
        };

        System.out.println("Mixed upper and lowercase: "+mix.mixUpperAndLower(str));

        Function<List<String>, List<String>> uppercase = strings -> {
            List<String> uppercaseLst = new ArrayList<>();
            for (String s : strings) {
                if (s != null) {
                    uppercaseLst.add(s.toUpperCase());
                }
            }
            return uppercaseLst;
        };

        Function<List<String>, List<String>> sort = strings -> {
            List<String> sorted = new ArrayList<>(List.copyOf(strings));
            sorted.sort((s1, s2) -> s1.compareTo(s2));
            return sorted;
        };

        System.out.println("Uppercase and sort: "+uppercase.andThen(sort).apply(str));
    }
}
