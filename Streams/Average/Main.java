package Desafios.Streams.Average;

import Desafios.Streams.Average.Models.Acc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 6, 8, 10, 18, 36, 5, 7));

        double avg = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println(numbers);
        System.out.println("Average: "+avg);

        Acc acc = IntStream.range(0, numbers.size())
                .collect(
                        Acc::new,
                        (a, index) -> {
                            a.weightedSum += numbers.get(index) * index+1;
                            a.weightSum += index+1;
                        },
                        (a1, a2) -> {
                            a1.weightedSum += a2.weightedSum;
                            a1.weightSum += a2.weightSum;
                        }
                );

        double weightedAvg = acc.weightedSum / acc.weightSum;
        System.out.println("\nWeighted average: "+weightedAvg);

        double evenAvg = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0);

        double oddAvg = numbers
                .stream()
                .filter(n -> n % 2 == 1)
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0);

        System.out.println("\nEven average minus odd average: "+(evenAvg - oddAvg));

        Predicate<Integer> isPrime = n -> {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        double primeAvg = numbers
                .stream()
                .filter(isPrime)
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0);

        System.out.println("\nPrime average: "+primeAvg);
    }
}
