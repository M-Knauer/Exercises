package Desafios.LambdaExpression.Factorial;

import java.util.function.Function;
import java.util.stream.IntStream;

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

        int result = IntStream.rangeClosed(1, num).reduce(1, (x,y) -> x*y);
        System.out.println("\nReduce");
        System.out.println(num+"! = "+result);
    }
}
