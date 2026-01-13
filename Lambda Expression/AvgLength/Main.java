package Desafios.LambdaExpression.AvgLength;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Black", "White", "Orange", "Blue", "", "", "    "));
        Predicate<String> notBlank = c -> !c.isBlank();

        double avg = colors.stream().mapToInt(String::length).average().orElse(0);

        System.out.println(colors);
        System.out.println("Average length of strings: "+String.format("%.1f", avg));

        System.out.println("\nFiltering out empty entries");
        System.out.println(colors.stream().filter(notBlank).toList());
        avg = colors.stream().filter(notBlank).mapToInt(String::length).average().orElse(0);
        System.out.println("Average length of strings: "+String.format("%.1f", avg));

        System.out.println("\nReduce");
        int sum = colors.stream().mapToInt(String::length).reduce(0, Integer::sum);
        System.out.println(sum / colors.size());

        System.out.println("\nSummary statics");
        System.out.println(colors.stream().filter(notBlank).toList());
        IntSummaryStatistics statistics = colors
                .stream()
                .filter(notBlank)
                .mapToInt(String::length)
                .summaryStatistics();

        System.out.println("Count: "+statistics.getCount());
        System.out.println("Sum: "+statistics.getSum());
        System.out.println("Average length: "+statistics.getAverage());
        System.out.println("Min length: "+statistics.getMin());
        System.out.println("Max length: "+statistics.getMax());
    }
}
