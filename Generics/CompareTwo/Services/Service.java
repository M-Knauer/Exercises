package Desafios.Generics.CompareTwo.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Service {
    public static <T extends Comparable<T>> boolean compareArrays(List<T> arr1, List<T> arr2) {
        if (arr1.size() == arr2.size()) {
            for (int i = 0; i < arr1.size(); i++) {
                if (!arr1.get(i).equals(arr2.get(i))) {return false;}
            }
            return true;
        }
        return false;
    }

    public static <T extends Comparable<T>> boolean isPermutation(List<T> arr1, List<T> arr2) {
        if (arr1.size() == arr2.size()) {
            return new HashSet<T>(arr1).containsAll(arr2);
        }
        return false;
    }

    public static <T extends Comparable<T>> boolean isCyclicRotation(List<T> arr1, List<T> arr2) {
        if (arr1.size() == arr2.size()) {
            List<T> tempA1 = new ArrayList<>(List.copyOf(arr1));
            List<T> tempA1Sub = tempA1.subList(0, tempA1.size());
            tempA1.addAll(tempA1Sub);
            for (int i = 0; i < arr2.size(); i++) {
                tempA1Sub = tempA1.subList(i, arr2.size() + i);
                if (tempA1Sub.equals(arr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> boolean compareArraysWithComp(List<T> a1, List<T> a2, Comparator<T> comp) {
        if (a1.size() == a2.size()) {
            for (int i = 0; i < a1.size(); i++) {
                if (comp.compare(a1.get(i), a2.get(i)) != 0) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    public static <T extends Comparable<T>> boolean checkUnique(List<T> a1, List<T> a2) {
        HashSet<T> hashA1 = new HashSet<>(a1);
        HashSet<T> hashA2 = new HashSet<>(a2);

        return hashA1.equals(hashA2);
    }
}
