package Desafios.LambdaExpression.LongestAndShortest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Red", "Green", "Blue", "Orange", "Black"));

        System.out.println("Elements of the list: "+words);
        int longest = words.stream().mapToInt(String::length).max().orElse(0);
        int shortest = words.stream().mapToInt(String::length).min().orElse(0);
        System.out.println("Length longest string in the list: "+longest);
        System.out.println("Length shortest string in the list: "+shortest);

    }
}
