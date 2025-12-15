package Desafios.Generics.GenericMap.Services;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PrintMap {
    public static <K, V> void printMap(HashMap<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }

    public static <K extends Comparable<K>, V> void sortedByKey(HashMap<K, V> map) {
        TreeMap<K, V> treeMap = new TreeMap<>(map);
        for (Map.Entry<K, V> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
    }
}
