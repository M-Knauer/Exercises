package Desafios.LambdaExpression.Prime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int num = 17729;
        System.out.println(isPrime.test(num) ? num+" is prime." : num+" not is prime.");

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<Integer> primes = numbers.stream().filter(isPrime).toList();
        System.out.println("Primes: "+primes);

        int start = 1;
        int end = 37;
        IntPredicate isPrimeInt = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        primes = IntStream.rangeClosed(start, end).filter(isPrimeInt).boxed().toList();
        System.out.println("Primes in range "+start+" to "+end+": "+primes);

        Function<Integer, Boolean> checkPrime = isPrime::test;
        Function<Integer, Integer> nextPrime = n -> {
            if (n == -1) {
                return -1;
            }
            int nextNum = n + 1;
            while (!checkPrime.apply(nextNum)) {
                nextNum++;
            }
            return nextNum;
        };

        int prime = nextPrime.apply(num);
        System.out.println("The first number is: "+num+ " and the next prime is: "+prime);
    }
}
