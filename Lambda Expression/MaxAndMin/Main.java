package Desafios.LambdaExpression.MaxAndMin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 7, 2, 9, 4));

        System.out.println("Max and min numbers");
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("Max: "+max.orElse(null));
        System.out.println("Min: "+min.orElse(null));

        System.out.println("\nMax and min numbers using reduce");
        int maxInt = numbers.stream().reduce(0, Integer::max);
        int minInt = numbers.stream().reduce(0, Integer::min);
        System.out.println("Max: "+maxInt);
        System.out.println("Min: "+minInt);

        System.out.println("\nLambda to calculate the difference between max and mix numbers");
        Function<List<Integer>, Integer> calculateDifference = integers -> {
            Optional<Integer> maxTmp = integers.stream().max(Integer::compareTo);
            Optional<Integer> minTmp = integers.stream().min(Integer::compareTo);

            return maxTmp.orElse(0) - minTmp.orElse(0);
        };
        System.out.println("Max and min difference: "+calculateDifference.apply(numbers));

        Collector<Integer, int[], List<Integer>> maxMinCollector = Collector.of(
                () -> new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE},
                (acc, num) -> {
                    acc[0] = Math.max(acc[0], num);
                    acc[1] = Math.min(acc[1], num);
                },
                (lst1, lst2) -> new int[] {
                    Math.max(lst1[0], lst2[0]),
                    Math.min(lst1[1], lst2[1])
                },
                acc -> List.of(acc[0], acc[1])
        );

        System.out.println("\nMax and min custom collector");
        List<Integer> maxMinPair = numbers.stream().collect(maxMinCollector);
        System.out.println(maxMinPair);
    }
}
