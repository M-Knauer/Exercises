package Desafios.LambdaExpression.CheckWords;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Red", "Green", "Blue", "Orange", "Black", "Blue"));

        String searchColor = "Orange";

        boolean checkColor = words.stream().anyMatch(w -> w.equalsIgnoreCase(searchColor));
        System.out.println(checkColor ? searchColor+" is in the list" : searchColor+" is not in the list");

        String searchString = "lu";

        boolean checkString = words.stream().anyMatch(w -> w.contains(searchString));
        System.out.println(checkString ? searchString+" is in the list" : searchString+" is not in the list");

        String keyword = "a";

        long filteredWordsCount = words.stream().filter(w -> w.contains(keyword)).count();
        System.out.println("Number of strings containing '"+keyword+"': "+filteredWordsCount);

        String searchWord = "Blue";
        String firstOccurrence = words
                .stream()
                .filter(w -> w.equalsIgnoreCase(searchWord))
                .findFirst()
                .orElse("");

        System.out.println(firstOccurrence.isBlank() ? "No match found for '"+searchWord+"'" : firstOccurrence);

        List<String> uppercaseWords = words
                .stream()
                .filter(w -> w.equalsIgnoreCase(searchWord))
                .map(String::toUpperCase).toList();

        System.out.println("Uppercase results for search '"+searchWord+"': "+uppercaseWords);
    }
}
