package Desafios.Streams.Average;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 6, 8, 10, 18, 36));

        double avg = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println(numbers);
        System.out.println("Average: "+avg);
    }
}
