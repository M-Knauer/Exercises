package Desafios.LambdaExpression.MultiplyAndSum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 2, 3, 6, 5, 1));

        System.out.println("Multiply and sum all numbers");
        int result = numbers.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Product of the list elements: "+result);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the list elements: "+sum);

    }
}
