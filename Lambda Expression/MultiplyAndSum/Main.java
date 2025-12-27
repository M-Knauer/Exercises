package Desafios.LambdaExpression.MultiplyAndSum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 2, 3, 6, 5, 1));

        System.out.println("Multiply and sum all numbers");
        int result = numbers.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Product of the list elements: "+result);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the list elements: "+sum);

        System.out.println("\nMultiply all elements and then adds a constant");
        Function<List<Integer>, Integer> multiply = lst ->
                lst.stream().reduce(1, (x, y) -> x * y);
        Function<Integer, Integer> sumConstant = n -> n + 20;
        System.out.println(multiply.andThen(sumConstant).apply(numbers));
    }
}
