package Desafios.LambdaExpression.EmptyString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.trim().isEmpty();

        String msg = "  ";
        //msg = "Hello, world!";

        System.out.println(isEmpty.test(msg) ? "Message is empty or contains only whitespace." : msg);

        Predicate<List<String>> isAllEmpty = strs -> {
            for (String str : strs) {
                if (!str.trim().isEmpty()) {
                    return false;
                }
            }
            return true;
        };

        List<String> strings = new ArrayList<String>(List.of("1 ", "", ""));

        System.out.println(isAllEmpty.test(strings) ? "All messages are empty" : "List of messages: "+strings);
    }
}
