package Desafios.Generics.FilterList.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> List<T> filter(List<T> lst, Predicate<T> predicate) {
        List<T> newLst = new ArrayList<>();

        for (T e : lst) {
            if (predicate.test(e)) {
                newLst.add(e);
            }
        }
        return newLst;
    }

    public static <T extends Comparable<T>> List<T> filterAndReverseSort(List<T> lst, Predicate<T> predicate) {
        List<T> newLst = new ArrayList<>(filter(lst, predicate));
        newLst.sort(Comparator.reverseOrder());
        return newLst;
    }

    public static <T> List<String> filterToString(List<T> lst, Predicate<T> predicate) {
        List<String> newLst = new ArrayList<>();

        for (T e : lst) {
            if (predicate.test(e)) {
                newLst.add(e.toString());
            }
        }
        return newLst;
    }

    public static <T> List<T> compositeFilter(List<T> lst, Predicate<T> p1, Predicate<T> p2) {
        List<T> newLst = new ArrayList<>();

        for (T e : lst) {
            if (p1.or(p2).test(e)) {
                newLst.add(e);
            }
        }
        return newLst;
    }
}
