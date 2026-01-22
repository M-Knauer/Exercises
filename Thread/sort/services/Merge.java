package Desafios.Thread.sort.services;

import java.util.ArrayList;
import java.util.List;

public class Merge {
    public static List<Integer> merge(List<Integer> lst1, List<Integer> lst2){
        List<Integer> merged = new ArrayList<>();
        merged.addAll(lst1);
        merged.addAll(lst2);
        merged.sort(Integer::compareTo);
        return merged;
    }
}
