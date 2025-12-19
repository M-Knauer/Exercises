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
            List<Integer> evenLst = new ArrayList<>();
            for (int num : integers) {
                if (isEven.test(num)) {
                    evenLst.add(num);
                }
            }
            return evenLst;
        };

        Function<List<Integer>, List<Integer>> odd = integers -> {
            List<Integer> oddLst = new ArrayList<>();
            for (int num : integers) {
                if (isOdd.test(num)) {
                    oddLst.add(num);
                }
            }
            return oddLst;
        };

        List<Integer> evenLst = even.apply(numbers);
        List<Integer> oddLst = odd.apply(numbers);

        System.out.println("List of even: "+evenLst);
        System.out.println("List of odd: "+oddLst);

        Function<List<Integer>, List<Integer>> squares = integers -> {
            List<Integer> squareList = new ArrayList<>();
            for (int num : integers) {
                squareList.add(num * num);
            }
            return squareList;
        };

        evenLst = even.andThen(squares).apply(numbers);

        System.out.println("Squares even: "+evenLst);
    }
}
