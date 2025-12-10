package Desafios.Generics.MergeList.Services;

import java.util.ArrayList;
import java.util.List;

public class Merge {

    public static <T> List<T> mergeAlternately(List<T> lst1, List<T> lst2) {
        int index1 = 0;
        int index2 = 0;
        int size1 = lst1.size() - 1;
        int size2 = lst2.size() - 1;
        List<T> mergedLst = new ArrayList<>();

        while (index1 <= size1 || index2 <= size2) {
            if (index1 <= size1) {
                mergedLst.add(lst1.get(index1));
            }
            if (index2 <= size2) {
                mergedLst.add(lst2.get(index2));
            }
            index1++;
            index2++;
        }

        return mergedLst;
    }
}
