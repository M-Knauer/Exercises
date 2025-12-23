package Desafios.LambdaExpression.Factorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        Function<List<Integer>, Map<Integer, Integer>> factorialToMap = integers -> {
            Map<Integer, Integer> map = new HashMap<>();
            for (int number : integers) {
                int res = 1;
                for (int i = number; i > 1; i--) {
                    res *= i;
                }
                map.put(number, res);
            }
            return map;
        };

        System.out.println("\nMap");
        Map<Integer, Integer> factorialMap = new HashMap<>(factorialToMap.apply(List.of(3, 4, 5, 6)));
        factorialMap.forEach((k,v) -> {
            System.out.println(k+"! = "+v);
        });
    }
}
