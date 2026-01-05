package Desafios.LambdaExpression.PerfectSquare;

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
    }
}
