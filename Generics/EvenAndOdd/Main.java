package Desafios.Generics.EvenAndOdd;
import Desafios.Generics.EvenAndOdd.Models.EvenAndOdd;

import java.util.ArrayList;
import java.util.List;

import static Desafios.Generics.EvenAndOdd.Services.Service.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 1, 4));
        sumEvenAndOdd(arr);

        EvenAndOdd evenAndOdd = getSumEvenAndOdd(arr);
        System.out.println("Even separated: "+evenAndOdd.even);
        System.out.println("Odd separated: "+evenAndOdd.odd);

        System.out.println("The difference between even and odd is: "+calculateDifference(arr));

        System.out.println(evenIsDivisibleByOdd(arr) ? "Even is divisible by odd." : "Even isn't divisible by odd.");
    }
}
