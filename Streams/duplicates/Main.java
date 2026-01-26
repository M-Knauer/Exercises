package Desafios.Streams.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 23, 22, 23, 24, 24, 33, 15, 26, 15));
        System.out.println("Original list: "+numbers);
        List<Integer> nonDuplicates =  new ArrayList<>(numbers.stream().distinct().toList());
        System.out.println("Non duplicate numbers list: "+nonDuplicates);

        List<Integer> sorted = new ArrayList<>(numbers.stream().distinct().sorted().toList());
        System.out.println("\nSorted by ascending order: "+sorted);

    }
}
