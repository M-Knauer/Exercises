package Desafios.LambdaExpression.CheckWords;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Red", "Green", "Blue", "Orange", "Black"));

        String searchColor = "Orange";

        boolean checkColor = words.stream().anyMatch(w -> w.equalsIgnoreCase(searchColor));
        System.out.println(checkColor ? searchColor+" is in the list" : searchColor+" is not in the list");

        String searchString = "lu";

        boolean checkString = words.stream().anyMatch(w -> w.contains(searchString));
        System.out.println(checkString ? searchString+" is in the list" : searchString+" is not in the list");
    }
}
