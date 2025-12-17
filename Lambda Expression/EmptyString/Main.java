package Desafios.LambdaExpression.EmptyString;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();

        String msg = "";
        //msg = "Hello, world!";

        System.out.println(isEmpty.test(msg) ? "Message is empty." : msg);
    }
}
