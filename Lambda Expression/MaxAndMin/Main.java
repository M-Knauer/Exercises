package Desafios.LambdaExpression.MaxAndMin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of());

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
    }
}
