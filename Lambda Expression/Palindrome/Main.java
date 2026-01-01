package Desafios.LambdaExpression.Palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String text = "ana";

        Predicate<String> isPalindrome = s -> s.contentEquals(new StringBuilder(s).reverse());

        System.out.println(isPalindrome.test(text) ? text+" is a palindrome" : text+" isn't a palindrome");

        System.out.println("\nIgnoring case and non-alphanumeric characters");
        Predicate<String> isPalindromeIgnoringCase = s -> {
            String formatedS = s.replaceAll("\\W", "");
            StringBuilder reversedS = new StringBuilder(formatedS);
            reversedS.reverse();
            return formatedS.equalsIgnoreCase(reversedS.toString());
        };
        text = "A Daniela ama a lei? Nada!";
        System.out.println(isPalindromeIgnoringCase.test(text) ?
                "'"+text+"' is a palindrome" : "'"+text+"' isn't a palindrome");

        System.out.println("\nCheck if every word in a sentence is a palindrome");
        Predicate<String> isAllPalindrome = s -> {
            List<String> txtList = new ArrayList<>(List.of(s.split("\\s+")));
            for (String str : txtList) {
                if (!str.contentEquals(new StringBuilder(str).reverse())) {
                    return false;
                }
            }
            return true;
        };
        text = "ana ama ovo";
        System.out.println(isAllPalindrome.test(text) ?
                "Every word in: '"+text+"' is a palindrome" :
                "There is non-palindrome word in: '"+text+"'");

        System.out.println("\nFilter out palindromic strings from a list");
        List<String> texts = new ArrayList<>(List.of("ana", "lei", "osso", "nada"));
        Predicate<String> filterOutPalindrome = s -> !s.contentEquals(new StringBuilder(s).reverse());
        List<String> nonPalindrome = texts.stream().filter(filterOutPalindrome).toList();
        System.out.println("Filtered list: "+nonPalindrome);
    }
}
