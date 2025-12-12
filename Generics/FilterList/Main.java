package Desafios.Generics.FilterList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static Desafios.Generics.FilterList.Services.Filter.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(5,4,7,99,4,6,2,1,9,8,154,85,3));
        List<String> colors = new ArrayList<String>(List.of("Red", "Brown", "Green", "White",
                "Orange", "Black", "Pink", "Blue", "Grey"));

        Predicate<Integer> greaterThan = n -> (n > 7) ;
        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<String> startsWith = c -> c.startsWith("B");
        Predicate<String> anotherStarts = c -> c.startsWith("G");


        System.out.println("Filter greater than 7: "+filter(numbers, greaterThan));
        System.out.println("Choose color which starts with B: "+filter(colors, startsWith));
        System.out.println("Filter and reverse sort: "+filterAndReverseSort(numbers, greaterThan));
        System.out.println("Filter and reverse sort: "+filterAndReverseSort(colors, startsWith));
        System.out.println("Filter and convert to string: "+filterToString(numbers, greaterThan));
        System.out.println("Filter and convert to string: "+filterToString(colors, startsWith));
        System.out.println("Composite filter: "+compositeFilter(numbers, greaterThan, even));
        System.out.println("Composite filter: "+compositeFilter(colors, startsWith, anotherStarts));
        System.out.println("Average filtered numbers: "
                +String.format("%.1f", filterAndGetAverage(numbers, greaterThan)));

    }
}
