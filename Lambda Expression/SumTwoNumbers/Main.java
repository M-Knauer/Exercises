package Desafios.LambdaExpression.SumTwoNumbers;

import Desafios.LambdaExpression.SumTwoNumbers.Models.CalculateNumbers;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static Desafios.LambdaExpression.SumTwoNumbers.Services.OperateFile.*;

public class Main {
    public static void main(String[] args) {
        CalculateNumbers<Integer> calculate = (x ,y) -> x + y;
        int res = calculate.operate(10, 5);
        System.out.println("x + y = "+res);

        System.out.println();

        int CONST = 10;
        calculate = (x, y) -> (x + y) * CONST;
        res = calculate.operate(10, 5);
        System.out.println("(x + y) * CONST = "+res);

        System.out.println();

        Path path = Paths.get("JavaNinja/src/Desafios/LambdaExpression/SumTwoNumbers/Resources/numbers.txt");
        List<Integer> numbers = new ArrayList<>(getNumbers(path));
        calculate = (x, y) -> x + y;
        res = calculate.operate(numbers.get(0), numbers.get(1));
        System.out.println("From file: X + Y = "+res);

        System.out.println();

        BiFunction<Integer, Integer, Integer> calculateFunc = (x, y) -> x + y;
        Function<Integer, String> format = result -> "Lambda concat: x + y = "+result;
        System.out.println(format.apply(calculateFunc.apply(10, 5)));

        System.out.println();

        Function<Integer, Integer> result =  element -> element - 3;

        System.out.println("Composition: x + y - 3 = "+calculateFunc.andThen(result).apply(10,5));

    }
}
