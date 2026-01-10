package Desafios.LambdaExpression.SumAllPrime;

import java.util.Map;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int init = 100;
        int end = 200;

        IntPredicate isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        int sum = IntStream.rangeClosed(init, end).filter(isPrime).sum();

        System.out.println("Sum of prime numbers between "+init+" and "+end+": "+sum);

        System.out.println("\nUsing reduce");
        sum = IntStream.rangeClosed(init, end).filter(isPrime).reduce(0, Integer::sum);
        System.out.println("Sum of prime numbers between "+init+" and "+end+": "+sum);

        System.out.println("\nMapping primes");
        sum = IntStream.rangeClosed(init, end).mapToObj(n -> Map.entry(n, isPrime.test(n)))
                .reduce(0, (acc, entry) -> entry.getValue() ?
                        acc + entry.getKey() : acc, Integer::sum);
        System.out.println("Sum of prime numbers between "+init+" and "+end+": "+sum);

        System.out.println("\nFilter, map and sum");
        sum = IntStream.rangeClosed(init, end).filter(isPrime).map(n -> n).sum();
        System.out.println("Sum of prime numbers between "+init+" and "+end+": "+sum);
    }
}
