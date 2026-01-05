package Desafios.LambdaExpression.SecondLargAndSmall;

import Desafios.LambdaExpression.SecondLargAndSmall.Models.Pairs;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 7, 18, 25, 21, 77, 39, 300, 300, 101);

        System.out.println("Getting the second largest and smallest numbers in the list: "+numbers);
        int secondLargest = numbers.stream()
                .distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        int secondSmallest = numbers.stream().distinct().sorted().skip(1).findFirst().orElse(0);

        System.out.println("Second largest: "+secondLargest);
        System.out.println("Second smallest: "+secondSmallest);

        System.out.println("\n" +
                "Getting the second number in the list by filtering out the maximum value: "+numbers);

        Predicate<Integer> filterOutMax = n -> n < numbers
                        .stream()
                        .mapToInt(Integer::intValue)
                        .max().orElse(0);

        secondLargest = numbers
                .stream()
                .filter(filterOutMax)
                .max(Integer::compareTo).orElse(0);

        System.out.println("Second largest: "+secondLargest);

        System.out.println("\nGetting the second largest and smallest pairs in the list: "+numbers);
        Pairs pairs = numbers.stream().distinct().sorted().collect(Collectors.collectingAndThen(
                Collectors.toList(),
                lst -> {
                    if (lst.size() < 2) {
                        throw new IllegalArgumentException("Not enough distinct elements");
                    }
                    return new Pairs(lst.get(lst.size() - 2), lst.get(1));
                }
        ));
        System.out.println("Pairs: "+pairs);
    }
}
