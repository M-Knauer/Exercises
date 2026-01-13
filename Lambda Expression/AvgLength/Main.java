package Desafios.LambdaExpression.AvgLength;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Black", "White", "Orange", "Blue", "", "", "    "));

        double avg = colors.stream().mapToInt(String::length).average().orElse(0);

        System.out.println(colors);
        System.out.println("Average length of strings: "+String.format("%.1f", avg));

        System.out.println("\nFiltering out empty entries");
        System.out.println(colors);
        avg = colors.stream().filter(c -> !c.isBlank()).mapToInt(String::length).average().orElse(0);
        System.out.println("Average length of strings: "+String.format("%.1f", avg));

        System.out.println("\nReduce");
        int sum = colors.stream().mapToInt(String::length).reduce(0, Integer::sum);
        System.out.println(sum / colors.size());
    }
}
