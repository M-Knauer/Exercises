package Desafios.LambdaExpression.SumTwoNumbers;

import Desafios.LambdaExpression.SumTwoNumbers.Models.CalculateNumbers;

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

    }
}
