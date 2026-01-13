package Desafios.LambdaExpression.LargestPrimeFactor;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) {return false;}
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(n -> num % n != 0);
    }

    public static void main(String[] args) {
        int num = 36;
        int largestPrime;

        Function<Integer, Integer> findLargestPrimeFactor = n -> {
            for (int i = n / 2; i > 2 ; i--) {
                if (n % i == 0 && isPrime(i)) {
                    return i;
                }
            }
            return n;
        };

        largestPrime = findLargestPrimeFactor.apply(num);
        System.out.println(largestPrime);

    }
}
