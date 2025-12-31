package Desafios.LambdaExpression.Palindrome;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String text = "A grama é amarga";

        Predicate<String> isPalindrome = s -> {
            String formatedS = s.toLowerCase().replace(" ","");
            StringBuilder reversedS = new StringBuilder(formatedS);
            reversedS.reverse();
            return formatedS.contentEquals(reversedS);
        };

        System.out.println(isPalindrome.test(text) ? text+" is a palindrome" : text+" isn't a palindrome");

    }
}
