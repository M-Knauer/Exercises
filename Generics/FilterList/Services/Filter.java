package Desafios.Generics.FilterList.Services;

import java.util.ArrayList;
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
}
