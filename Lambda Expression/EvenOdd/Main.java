package Desafios.LambdaExpression.EvenOdd;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(11, 23, 98, 34, 15, 32, 42, 80, 99, 100));


        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 == 1;

        Function<List<Integer>, List<Integer>> even = integers -> {
            List<Integer> evens = new ArrayList<>();
            for (int num : integers) {
                if (isEven.test(num)) {
                    evens.add(num);
                }
            }
            return evens;
        };

        Function<List<Integer>, List<Integer>> odd = integers -> {
            List<Integer> odds = new ArrayList<>();
            for (int num : integers) {
                if (isOdd.test(num)) {
                    odds.add(num);
                }
            }
            return odds;
        };

        List<Integer> evens = even.apply(numbers);
        List<Integer> odds = odd.apply(numbers);

        System.out.println("Evens: "+evens);
        System.out.println("Odds: "+odds);
    }
}
