package Desafios.Generics.MergeList;

import java.util.ArrayList;
import java.util.List;

import static Desafios.Generics.MergeList.Services.Merge.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<Integer>(List.of(1, 3, 5, 7, 9, 10));
        List<Integer> lst2 = new ArrayList<Integer>(List.of(2, 4, 6, 8));

        System.out.println("Merged list: "+mergeAlternately(lst1, lst2));
    }
}
