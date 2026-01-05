package Desafios.LambdaExpression.SecondLargAndSmall;

import java.util.Comparator;
import java.util.List;

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

        secondLargest = numbers
                .stream()
                .filter(n ->
                        n < numbers
                                .stream()
                                .mapToInt(Integer::intValue)
                                .max().orElse(0))
                .max(Integer::compareTo).orElse(0);

        System.out.println("Second largest: "+secondLargest);


    }
}
