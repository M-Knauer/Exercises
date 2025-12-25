package Desafios.LambdaExpression.Concatenate;

import Desafios.LambdaExpression.Concatenate.Models.Concatenate;
import Desafios.LambdaExpression.Concatenate.Models.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        String first = "Merry ";
        String second = "Christmas!";

        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
        System.out.printf("Concatenating '%s' and '%s'\n", first, second);
        System.out.println(concat.apply(first, second));

        Concatenate withDelimiter = (s1, s2, deli) -> {
            return s1+deli+s2;
        };

        first = "Manda";
        second = "Chuva";
        String delimiter = "-";
        System.out.printf("\nConcatenating with '%s' and '%s' with delimiter '%s'\n", first, second, delimiter);
        System.out.println(withDelimiter.concat(first, second, delimiter));

        Sentence sentence = strings -> {
            StringBuilder singleSentence = new StringBuilder();
            for (String s : strings) {
                singleSentence.append(s);
            }
            return singleSentence.toString();
        };

        List<String> stringList = new ArrayList<String>(
                List.of("Merry ", "Christmas,", " and ", "happy ", "new ", "year!"));

        System.out.println("\nConcatenating a list of strings");
        System.out.println(sentence.make(stringList));

        BiFunction<String, String, String> greaterFirst =
                (s1, s2) -> s1.length() >= s2.length() ? s1+s2 : s2+s1;

        first = "Eu sou menor";
        second = "Eu sou o maior";
        System.out.println(greaterFirst.apply(first, second));
    }
}
