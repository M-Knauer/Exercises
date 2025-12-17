package Desafios.LambdaExpression.EmptyString;

import Desafios.LambdaExpression.EmptyString.Models.IsEmptyString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.trim().isEmpty();

        String msg = "  ";

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

        IsEmptyString isEmptyString = s -> s.trim().isEmpty() ? "Message is empty." : s;
        msg = "Hello, world!";
        System.out.println(isEmptyString.isEmptyDefaultMsg(msg));
    }
}
