package Desafios.Generics.MergeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static Desafios.Generics.MergeList.Services.Merge.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 0, 5, 8, null);
        List<Integer> lst2 = Arrays.asList(3, 2, null, 4, 7, 6, 9);
        Comparator<Integer> comp = (e1, e2) -> e1.compareTo(e2);
        System.out.println("Merged list: "+mergeAlternately(lst1, lst2));
        System.out.println("Merged and sort: "+mergeAndSort(lst1, lst2, comp));
    }
}
