package Desafios.LambdaExpression.Concatenate;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        String first = "Marry ";
        String second = "Christmas!";

        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
        System.out.printf("Concatenating '%s' and '%s'\n", first, second);
        System.out.println(concat.apply(first, second));
    }
}
