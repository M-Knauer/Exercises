package Desafios.Generics.FindIndex.Services;

import java.util.List;

public class Service {
    public static <T> int findIndexRecursion(List<T> lst, T target, int startIndex) {
        if (lst.size() == startIndex) {
            return -1;
        } else if (lst.get(startIndex).equals(target)) {
            return startIndex;
        }
        return findIndexRecursion(lst, target, startIndex + 1);
    }

    public static <T> int findIndex(List<T> lst, T target) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int findLastIndex(List<T> lst, T target) {
        for (int i = lst.size()-1; i >= 0; i--) {
            if (lst.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> lst, T target) {
        int left = 0;
        int right = lst.size() - 1;

        while (left <= right){
            int mid = (left + right)  / 2;
            if (target.compareTo(lst.get(mid)) < 0) {
                right = mid - 1;
            } else if (target.compareTo(lst.get(mid)) > 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
