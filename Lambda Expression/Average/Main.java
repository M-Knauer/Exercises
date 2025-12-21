package Desafios.LambdaExpression.Average;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<Double>(List.of(3.5, 7.5, 4.3, 4.7, 5.1, -3.0, -2.1));

        double average = numbers.stream()
                .mapToDouble(d -> d)
                .average().orElse(0.);

        System.out.println("Average: "+average);

        double ignoreNegativesAvr = numbers.stream()
                .filter(d -> d > 0)
                .mapToDouble(d -> d)
                .average().orElse(0.);

        System.out.println("Average Ignoring negative values: "+ignoreNegativesAvr);

        double averageSquare = numbers.stream()
                .mapToDouble(d -> d * d)
                .average().orElse(0.0);

        System.out.println("Average square: "+averageSquare);

        System.out.println();

        long start = System.nanoTime();
        double parallelAverage = numbers.parallelStream()
                .mapToDouble(d -> d)
                .average().orElse(0.0);

        System.out.println("Parallel average: "+parallelAverage);
        long end = System.nanoTime();
        System.out.println("Parallel stream time: "+(end - start));

        System.out.println();

        start = System.nanoTime();
        double normalAverage = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0.0);

        System.out.println("Normal average: "+normalAverage);
        end = System.nanoTime();
        System.out.println("Normal stream time: "+(end - start));

        double filterAndTransform = numbers.stream()
                .filter(d -> d > 0)
                .mapToDouble(d -> d / 2)
                .average().orElse(0.);

        System.out.println("Filter and transform avg: "+filterAndTransform);
    }
}
