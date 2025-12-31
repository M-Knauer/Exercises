package Desafios.LambdaExpression.Palindrome;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String text = "ana";

        Predicate<String> isPalindrome = s -> s.contentEquals(new StringBuilder(s).reverse());

        System.out.println(isPalindrome.test(text) ? text+" is a palindrome" : text+" isn't a palindrome");

        System.out.println("\nIgnoring case and non-alphanumeric characters");
        isPalindrome = s -> {
            String formatedS = s.replaceAll("\\W", "");
            StringBuilder reversedS = new StringBuilder(formatedS);
            reversedS.reverse();
            return formatedS.equalsIgnoreCase(reversedS.toString());
        };
        text = "A Daniela ama a lei? Nada!";
        System.out.println(isPalindrome.test(text) ? "'"+text+"' is a palindrome" : "'"+text+"' isn't a palindrome");


    }
}
