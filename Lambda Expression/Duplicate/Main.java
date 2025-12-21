package Desafios.LambdaExpression.Duplicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(21, 1, 2, 3, 3, 4, 3, 0, 0, 2, 11, 5, 6, 1, 7, 7, 8, 10));
        List<Integer> uniques = new ArrayList<>();

        uniques.addAll(numbers.stream()
                .distinct().toList());

        System.out.println("Unique numbers: "+uniques);

        List<Integer> uniquesSorted = new ArrayList<>();

        uniquesSorted.addAll(numbers.stream()
                .distinct()
                .sorted((n1, n2) -> n1.compareTo(n2)).toList());

        System.out.println("Unique sorted numbers: "+uniquesSorted);
    }
}
