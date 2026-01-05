package Desafios.LambdaExpression.PerfectSquare;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPerfectSquare = n -> (Math.sqrt(n) - (int) Math.sqrt(n)) == 0;
        int num = 10000;
        System.out.println(num+" is a perfect square? "+isPerfectSquare.test(num));

        isPerfectSquare = n -> {
            int res = (int) Math.floor(Math.sqrt(n));
            return res * res == n;
        };

        System.out.println(num+" is a perfect square using floor? "+isPerfectSquare.test(num));

        isPerfectSquare = n -> {
            long res = Math.round(Math.sqrt(n));
            return res * res == n;
        };

        System.out.println(num+" is a perfect square after rounding? "+isPerfectSquare.test(num));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> perfectSquareNumbers = numbers.stream().filter(isPerfectSquare).toList();
        System.out.println("\nOriginal list: "+numbers);
        System.out.println("Only perfect squares: "+perfectSquareNumbers);
    }
}
