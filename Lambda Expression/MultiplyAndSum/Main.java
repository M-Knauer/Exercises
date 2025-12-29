package Desafios.LambdaExpression.MultiplyAndSum;

import Desafios.LambdaExpression.MultiplyAndSum.Models.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 2, 3, 6, 5, 1));

        System.out.println("Multiply and sum all numbers");
        int result = numbers.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Product of the list elements: "+result);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the list elements: "+sum);

        System.out.println("\nMultiplies all elements and then adds a constant");
        Function<List<Integer>, Integer> multiply = lst ->
                lst.stream().reduce(1, (x, y) -> x * y);
        Function<Integer, Integer> sumConstant = n -> n + 20;
        System.out.println(multiply.andThen(sumConstant).apply(numbers));

        System.out.println("\nMultiply and sum all numbers with reduce");
        Function<Integer, Integer> sumNumbers = n -> numbers.stream().reduce(0, Integer::sum);
        System.out.println(multiply.andThen(sumNumbers).apply(numbers));

        System.out.println("\nReturns both the product and the sum");
        Function<List<Integer>, Result> multipliesSum = integers -> {
            Result res = new Result();
            res.multiply = integers.stream().reduce(1, (a, b) -> a*b);
            res.sum = integers.stream().mapToInt(Integer::intValue).sum();

            return res;
        };
        Result resObj = multipliesSum.apply(numbers);
        System.out.println(resObj.multiply);
        System.out.println(resObj.sum);

        System.out.println("\nSum of products for pairs of adjacent elements");
        Function<List<Integer>, List<Integer>> multipliesPairs = integers -> {
            List<Integer> multipliedPairs = new ArrayList<>();

            int index1 = 0;
            int index2 = 1;
            int limit = integers.size() - 1;
            while (index2 <= limit) {
                int n1 = integers.get(index1);
                int n2 = integers.get(index2);
                multipliedPairs.add(n1 * n2);
                index1++;
                index2++;
            }

            return multipliedPairs;
        };

        Function<List<Integer>, Integer> sumPairs = integers ->
                integers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(multipliesPairs.andThen(sumPairs).apply(numbers));

        // alternative way
        int total = IntStream.rangeClosed(0, numbers.size() - 2)
                .map(i -> numbers.get(i) * numbers.get(i+1))
                .sum();
        System.out.println(total);
    }
}
