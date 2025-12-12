package Desafios.Generics.FilterList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static Desafios.Generics.FilterList.Services.Filter.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(5,4,7,99,4,6,2,1,9,8,154,85));
        List<String> colors = new ArrayList<String>(List.of("Red", "Green", "White", "Orange", "Black", "Pink"));

        Predicate<Integer> greaterThan = n -> n > 7;
        System.out.println("Filter greater than 9: "+filter(numbers, greaterThan));
        Predicate<String> chooseColor = c -> c.equals("Green");
        System.out.println("Choose color green: "+filter(colors, chooseColor));

    }
}
