package Desafios.LambdaExpression.AvgLength;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Black", "White", "Orange", "Blue"));

        double avg = colors.stream().mapToInt(String::length).average().orElse(0);

        System.out.println(colors);
        System.out.println("Average length of strings: "+String.format("%.1f", avg));
    }
}
