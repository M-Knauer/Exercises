package Desafios.Generics.MergeList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static Desafios.Generics.MergeList.Services.Merge.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<Integer>(List.of(1, 0, 5, 8));
        List<Integer> lst2 = new ArrayList<Integer>(List.of(3, 2, 4, 7, 6, 9));
        Comparator<Integer> comp = (e1, e2) -> e1.compareTo(e2);
        System.out.println("Merged list: "+mergeAlternately(lst1, lst2));
        System.out.println("Merged and sort: "+mergeAndSort(lst1, lst2, comp));
    }
}
