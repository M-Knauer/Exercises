package Desafios.Generics.FilterList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static Desafios.Generics.FilterList.Services.Filter.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(5,4,7,99,4,6,2,1,9,8,154,85));
        List<String> colors = new ArrayList<String>(List.of("Red", "Brown", "Green", "White",
                "Orange", "Black", "Pink", "Blue"));

        Predicate<Integer> greaterThan = n -> n > 7;
        Predicate<String> chooseColor = c -> c.startsWith("B");

        System.out.println("Filter greater than 7: "+filter(numbers, greaterThan));
        System.out.println("Choose color which starts with B: "+filter(colors, chooseColor));
        System.out.println("Filter and reverse sort: "+filterAndReverseSort(numbers, greaterThan));
        System.out.println("Filter and reverse sort: "+filterAndReverseSort(colors, chooseColor));
        System.out.println("Filter and convert to string: "+filterToString(numbers, greaterThan));
        System.out.println("Filter and convert to string: "+filterToString(colors, chooseColor));

    }
}
