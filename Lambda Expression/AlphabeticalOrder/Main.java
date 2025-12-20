package Desafios.LambdaExpression.AlphabeticalOrder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("red", "green", "blue", "black", "pink", "grey", "purple"));

        colors.sort((c1, c2) -> c1.compareToIgnoreCase(c2));
        System.out.println("Alphabetical order: "+colors);

        colors.sort((c1, c2) -> c2.compareToIgnoreCase(c1));
        System.out.println("Reverse alphabetical order: "+colors);

    }
}
