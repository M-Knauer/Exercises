package Desafios.LambdaExpression.Factorial;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int num = 6;
        Function<Integer, Integer> factorial = n -> {
            int calculate = 1;
            for (int i = n; i > 1; i--) {
                calculate *= i;
            }
            return calculate;
        };

        System.out.println(num+"! = "+factorial.apply(num));
    }
}
