package Desafios.LambdaExpression.AlphabeticalOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("red", "green", "blue", "black", "pink", "grey", "purple"));

        colors.sort((c1, c2) -> c1.compareToIgnoreCase(c2));
        System.out.println("Alphabetical order: "+colors);

        colors.sort((c1, c2) -> c2.compareToIgnoreCase(c1));
        System.out.println("Reverse alphabetical order: "+colors);

        Comparator<String> lengthOrder = (s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        };

        Comparator<String> ifEqualsLenAlpha = (s1, s2) -> {
            return s1.compareToIgnoreCase(s2);
        };
        colors.sort(lengthOrder.thenComparing(ifEqualsLenAlpha));
        System.out.println("Sort by length: "+colors);

        Function<List<String>, List<String>> startsWithFilter = strings -> {
            List<String> filtered = new ArrayList<>();
            for (String s : strings) {
                if (!s.toLowerCase().startsWith("b")) {
                    filtered.add(s);
                }
            }
            return filtered;
        };

        Function<List<String>, List<String>> sortByLenThenAlpha = strings -> {
            List<String> sorted = new ArrayList<>(List.copyOf(strings));
            sorted.sort(lengthOrder.thenComparing(ifEqualsLenAlpha));
            return sorted;
        };

        System.out.println("Filtered: "+sortByLenThenAlpha.andThen(startsWithFilter).apply(colors));
    }
}
