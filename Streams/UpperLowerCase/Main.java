package Desafios.Streams.UpperLowerCase;

import Desafios.LambdaExpression.UpperAndLowercase.Models.UpperAndLowercase;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("\nUppercase and lower case using collect");
        System.out.println(upLow.getUppercases());
        System.out.println(upLow.getLowercases());

    }
}
