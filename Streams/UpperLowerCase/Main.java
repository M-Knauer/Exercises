package Desafios.Streams.UpperLowerCase;

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

    }
}
