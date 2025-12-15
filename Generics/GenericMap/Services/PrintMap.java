package Desafios.Generics.GenericMap.Services;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {
    public static <K, V> void printMap(HashMap<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }
}
