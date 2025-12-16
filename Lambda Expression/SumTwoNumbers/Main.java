package Desafios.LambdaExpression.SumTwoNumbers;

import Desafios.LambdaExpression.SumTwoNumbers.Models.CalculateNumbers;

public class Main {
    public static void main(String[] args) {
        CalculateNumbers<Integer> calculate = (x ,y) -> x + y;
        int res = calculate.sum(10, 5);
        System.out.println(res);
    }
}
