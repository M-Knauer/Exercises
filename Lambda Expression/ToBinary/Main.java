package Desafios.LambdaExpression.ToBinary;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        Function<Integer, String> toBinary = Integer::toBinaryString;

        System.out.printf("The binary version of '%d' is: %s%n",num, toBinary.apply(num));
    }
}
