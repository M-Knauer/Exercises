package Desafios.LambdaExpression.Duplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(21, 1, 2, 3, 3, 4, 3, 0, 0, 2, 11, 5, 6, 1, 7, 7, 8, 10));
        List<Integer> uniques = new ArrayList<>();

        uniques.addAll(numbers.stream()
                .distinct().toList());

        System.out.println("Unique numbers: "+uniques);

        List<Integer> uniquesSorted = new ArrayList<>();

        uniquesSorted.addAll(numbers.stream()
                .distinct()
                .sorted((n1, n2) -> n1.compareTo(n2)).toList());

        System.out.println("Unique sorted numbers: "+uniquesSorted);

        int total = numbers.stream()
                .distinct()
                .mapToInt(n -> n)
                .sum();

        System.out.println("Total of unique values: "+total);

        long count = numbers.stream()
                .distinct()
                .count();

        System.out.println("Count of unique numbers: "+count);

        Set<Integer> uniquesSet;

        uniquesSet = numbers.stream()
                .distinct().collect(Collectors.toSet());

        System.out.println("Set: "+uniquesSet);
    }
}
