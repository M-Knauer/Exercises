package Desafios.Thread.sort.services;

import java.util.ArrayList;
import java.util.List;

public class PopulateList {
    public static List<Integer> populate(int size) {
        List<Integer> population = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            population.add((int) (Math.random() * size));
        }
        return population;
    }
}
