package Desafios.LambdaExpression.MaxAndMin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(12, 15, 0, 8, 7, 9, -6));

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


    }
}
