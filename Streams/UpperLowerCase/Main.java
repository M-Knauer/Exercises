package Desafios.Streams.UpperLowerCase;

import Desafios.LambdaExpression.UpperAndLowercase.Models.UpperAndLowercase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("RED", "grEEn", "white", "Orange", "pink"));

        List<String> uppercase = new ArrayList<>(List.copyOf(colors.stream().map(String::toUpperCase).toList()));
        List<String> lowercase = new ArrayList<>(List.copyOf(colors.stream().map(String::toLowerCase).toList()));
        System.out.println("Original list: "+colors);
        System.out.println("Uppercase: "+uppercase);
        System.out.println("Lowercase: "+lowercase);

        UpperAndLowercase upLow = colors.stream().collect(
                UpperAndLowercase::new,
                (acc, color) -> {
                    acc.getUppercases().add(color.toUpperCase());
                    acc.getLowercases().add(color.toLowerCase());
                },
                (acc1, acc2) -> {
                    acc1.getUppercases().addAll(acc2.getUppercases());
                    acc1.getLowercases().addAll(acc2.getLowercases());
                }
        );
        System.out.println("\nUppercase and lowercase using collect");
        System.out.println(upLow.getUppercases());
        System.out.println(upLow.getLowercases());

        System.out.println("\nUppercase strings using joining into a single string");
        String uppercaseString = colors.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(uppercaseString);

        upLow = colors.stream().collect(
                UpperAndLowercase::new,
                (acc, color) -> {
                    if (List.of('a','e','i','o','u').contains(color.toLowerCase().charAt(0))) {
                        acc.getUppercases().add(color.toUpperCase());
                    } else {
                        acc.getLowercases().add(color.toLowerCase());
                    }
                },
                (a1, a2) -> {
                    a1.getUppercases().addAll(a2.getUppercases());
                    a1.getLowercases().addAll(a2.getLowercases());
                }
        );
        System.out.println("\nConverting strings that start with a vowel to uppercase, otherwise to lowercase");
        System.out.println("Uppercase: "+upLow.getUppercases());
        System.out.println("Lowercase: "+upLow.getLowercases());

        lowercase = colors
                .stream()
                .map(String::toLowerCase)
                .sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("\nConverting strings to lowercase and sorting by length");
        System.out.println(lowercase);
    }
}
