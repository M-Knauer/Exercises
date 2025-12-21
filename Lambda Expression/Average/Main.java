package Desafios.LambdaExpression.Average;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<Double>(List.of(3.5, 7.5, 4.3, 4.7, 5.1, -3.0, -2.1));

        double average = numbers.stream().mapToDouble(d -> d).average().orElse(0.);
        System.out.println("Average: "+String.format("%.2f", average));

        double ignoreNegativesAvr = numbers.stream()
                .filter(d -> d > 0)
                .mapToDouble(d -> d)
                .average().orElse(0.);

        System.out.println("Average Ignoring negative values: "+String.format("%.2f", ignoreNegativesAvr));

        double averageSquare = numbers.stream()
                .mapToDouble(d -> d * d)
                .average().orElse(0.0);

        System.out.println("Average square: "+averageSquare);
    }
}
