package Desafios.LambdaExpression.PerfectSquare;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPerfectSquare = n -> (Math.sqrt(n) - (int) Math.sqrt(n)) == 0;
        System.out.println(isPerfectSquare.test(10000));

        isPerfectSquare = n -> {
            int res = (int) Math.floor(Math.sqrt(n));
            return res * res == n;
        };

        System.out.println(isPerfectSquare.test(35));
    }
}
