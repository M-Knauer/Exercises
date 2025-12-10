package Desafios.Generics.ReverseGenericList.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static <T> List<T> reverseList(List<T> lst) {
        List<T> reversedList = new ArrayList<>();

        for (int i = lst.size() - 1; i >= 0; i--) {
            reversedList.add(lst.get(i));
        }

        return reversedList;
    }

    public static <T> void reverseInPlace(List<T> lst) {
        int start = 0;
        int end = lst.size() - 1;

        while (start < end) {
            Collections.swap(lst, start, end);
            start++;
            end--;
        }
    }

    public static <T> List<T> reverseListByRecursion(List<T> lst, int start, int end) {
        if (start > end) {
            return lst;
        }
        Collections.swap(lst, start, end);
        return reverseListByRecursion(lst, start + 1, end - 1);
    }
}
