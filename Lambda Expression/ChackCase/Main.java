package Desafios.LambdaExpression.ChackCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Java", "JAVA", "java"));

        Function<List<String>, String> checkCase = lst -> {
            int len = lst.size();
            int upperCount = 0;
            int lowerCount = 0;
            for (String word : lst) {
                String wordAux = word.toUpperCase();
                if (wordAux.equals(word)) {
                    upperCount++;
                }
                wordAux = word.toLowerCase();
                if (wordAux.equals(word)) {
                    lowerCount++;
                }
            }
            if (upperCount == len) {
                return "Uppercase";
            } else if (lowerCount == len) {
                return "Lowercase";
            }
            return "Mixedcase";
        };
        System.out.println(words);
        System.out.println(checkCase.apply(words));
        System.out.println();

        words = List.of("JAVA", "PYTHON", "ABC");
        System.out.println(words);
        System.out.println(checkCase.apply(words));
        System.out.println();

        words = List.of("java");
        System.out.println(words);
        System.out.println(checkCase.apply(words));
        System.out.println();

        words = List.of("JAVA", "PYTHON", "ABC");
        System.out.println(words);
        boolean isAllUppercase = words.stream().allMatch(w -> w.equals(w.toUpperCase()));
        System.out.println("Are all strings uppercase (with allMatch): "+isAllUppercase);
        System.out.println();

        words = List.of("java", "python", "cobol");
        System.out.println(words);
        boolean isAllLowercase = words.stream().allMatch(w -> w.equals(w.toLowerCase()));
        System.out.println("Are all strings lowercase: "+isAllLowercase);
        System.out.println();

        Function<String, String> classifier = w -> {
            if (w.equals(w.toLowerCase())) {
                return "Lowercase";
            } else if (w.equals(w.toUpperCase())) {
                return "Uppercase";
            }
            return "Mixedcase";
        };
        words = List.of("java", "python", "Cobol", "JAVASCRIPT", "PHP");
        Map<String, List<String>> wordMap = words.stream().collect(Collectors.groupingBy(classifier));
        System.out.println(wordMap);
        System.out.println(wordMap.size() > 1 ? "The strings aren't uniform." : "The strings are uniform.");
    }
}
