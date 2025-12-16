package Desafios.Generics.GenericMap;

import java.util.HashMap;

import static Desafios.Generics.GenericMap.Services.PrintMap.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> infos = new HashMap<>();
        infos.put("Ana", 23);
        infos.put("Carlos", 31);
        infos.put("João", 29);

        printMap(infos);
        System.out.println();
        sortedByKey(infos);
        System.out.println();
        printFormatted(infos);
        System.out.println();
        printHighlights(infos);
        System.out.println();
        printReverseOrder(infos);
    }
}
