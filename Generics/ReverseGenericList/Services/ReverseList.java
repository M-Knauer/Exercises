package Desafios.Generics.ReverseGenericList.Services;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static <T> List<T> reverseList(List<T> lst) {
        List<T> reversedList = new ArrayList<>();

        for (int i = lst.size() - 1; i >= 0; i--) {
            reversedList.add(lst.get(i));
        }

        return reversedList;
    }
}
