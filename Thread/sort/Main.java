package Desafios.Thread.sort;

import Desafios.Thread.sort.services.Merge;
import Desafios.Thread.sort.services.PopulateList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int size = 400;

    public static void main(String[] args) {
        List<Integer> numbers = PopulateList.populate(size);
        int mid = numbers.size() / 2;
        List<Integer> lst1 = new ArrayList<>(List.copyOf(numbers.subList(0, mid)));
        List<Integer> lst2 = new ArrayList<>(List.copyOf(numbers.subList(mid, numbers.size())));

        Thread t1 = new Thread(() -> lst1.sort(Integer::compareTo));

        Thread t2 = new Thread(() -> lst2.sort(Integer::compareTo));

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Merge.merge(lst1, lst2));
    }
}
