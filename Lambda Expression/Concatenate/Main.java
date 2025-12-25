package Desafios.LambdaExpression.Concatenate;

import Desafios.LambdaExpression.Concatenate.Models.Concatenate;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        String first = "Marry ";
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
        System.out.printf("Concatenating with '%s' and '%s' with delimiter '%s'\n", first, second, delimiter);
        System.out.println(withDelimiter.concat(first, second, delimiter));
    }
}
