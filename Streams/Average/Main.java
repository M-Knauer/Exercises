package Desafios.Streams.Average;

import Desafios.Streams.Average.Models.Acc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 6, 8, 10, 18, 36));

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
    }
}
