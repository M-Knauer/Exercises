package Desafios.Generics.MergeList.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Merge {

    public static <T> List<T> mergeAlternately(List<T> lst1, List<T> lst2) {
        int size1 = lst1.size();
        int size2 = lst2.size();
        int maxLen = Math.max(size1, size2);
        List<T> mergedLst = new ArrayList<>();

        for (int i = 0; i < maxLen; i++) {
            if (i < size1) {
                mergedLst.add(lst1.get(i));
            }

            if (i < size2) {
                mergedLst.add(lst2.get(i));
            }
        }

        return mergedLst;
    }

    public static <T> List<T> mergeAndSort(List<T> l1, List<T> l2, Comparator<T> comp) {
        List<T> mergedL = new ArrayList<>(mergeAlternately(l1, l2));
        mergedL.sort(comp);
        return mergedL;
    }
}
