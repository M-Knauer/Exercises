package Desafios.LambdaExpression.LongestAndShortest;

import Desafios.LambdaExpression.LongestAndShortest.Models.Pairs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Red", "Green", "Blue", "Orange", "Black"));

        System.out.println("Elements of the list: "+words);
        int longestStr = words.stream().mapToInt(String::length).max().orElse(0);
        int shortestStr = words.stream().mapToInt(String::length).min().orElse(0);
        System.out.println("Length longest string in the list: "+longestStr);
        System.out.println("Length shortest string in the list: "+shortestStr);

        System.out.println("\nLongest and shortest string in the list");
        Pairs longestAndShortest = words
                .stream()
                .collect(
                        () -> new Pairs(null, null),
                        (acc, word) -> {
                            if (acc.longest == null || word.length() > acc.longest.length()) {
                                acc.longest = word;
                            }
                            if (acc.shortest == null || word.length() < acc.shortest.length()) {
                                acc.shortest = word;
                            }
                        },
                        (acc1, acc2) -> {
                            if (acc1.longest == null || (acc2.longest != null &&
                                    acc2.longest.length() > acc1.longest.length())) {
                                acc1.longest = acc2.longest;
                            }
                            if (acc1.shortest == null || (acc2.shortest != null &&
                                    acc2.shortest.length() < acc1.shortest.length())) {
                                acc1.shortest = acc2.shortest;
                            }
                        }
                );
        System.out.println("Longest: " + longestAndShortest.longest);
        System.out.println("Shortest: " + longestAndShortest.shortest);

    }
}
