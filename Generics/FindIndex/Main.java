package Desafios.Generics.FindIndex;

import java.util.ArrayList;
import java.util.List;

import static Desafios.Generics.FindIndex.Services.Service.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>(List.of(2,5,8,12,16,23,38,56,72,91));
        long start = System.nanoTime();
        System.out.println("Recursion: "+findIndexRecursion(lst, 5, 0));
        long end = System.nanoTime();
        System.out.println("Running time: "+ (end - start));

        start = System.nanoTime();
        System.out.println("Normal: "+findIndex(lst, 2));
        end = System.nanoTime();
        System.out.println("Running time: "+ (end - start));

        start = System.nanoTime();
        System.out.println("Last index: "+findLastIndex(lst, 56));
        end = System.nanoTime();
        System.out.println("Running time: "+ (end - start));

        start = System.nanoTime();
        System.out.println("Binary search: "+binarySearch(lst, 12));
        end = System.nanoTime();
        System.out.println("Running time: "+ (end - start));

    }
}
