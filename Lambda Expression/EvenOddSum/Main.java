package Desafios.LambdaExpression.EvenOddSum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Sum squares of odd/even numbers using lambda");
        int sumEven = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n*n).sum();
        int sumOdd = numbers.stream().filter(n -> n % 2 == 1).mapToInt(n -> n*n).sum();
        System.out.println("Even: "+sumEven);
        System.out.println("Odd: "+sumOdd);

    }
}
