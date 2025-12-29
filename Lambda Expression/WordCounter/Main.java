package Desafios.LambdaExpression.WordCounter;

import Desafios.LambdaExpression.WordCounter.Models.WordCounter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String sentence = "eu vou";
        System.out.println("Sentence: "+sentence);
        WordCounter wordCounter = s -> s.trim().split("\\s+").length;
        System.out.println("Word count: "+wordCounter.count(sentence));

        System.out.println("\nRemoving string punctuation");
        wordCounter = s -> s.trim().replaceAll("[,.;!?:]", "").split("\\s+").length;
        System.out.println(sentence.trim().replaceAll("[,.;!?:]", ""));
        System.out.println("Word count: "+wordCounter.count(sentence));

        System.out.println("\nRemoving stop words");
        Predicate<String> filterStopWords = text ->
                !List.of("o", "a", "de", "e", "para", "em").contains(text.toLowerCase());
        wordCounter = s -> Arrays.stream(s.trim().split("\\s+")).filter(filterStopWords).toArray().length;
        Arrays.stream(sentence.trim().split("\\s+")).filter(filterStopWords).forEach(s ->
                System.out.print(s+" "));
        System.out.println("\nWord count: "+wordCounter.count(sentence));

        System.out.println("\nIt maps each word and sums their lengths");
        System.out.println(sentence);
        int total = Arrays.stream(sentence.split("\\s+")).mapToInt(String::length).sum();
        System.out.println("Sum: "+total);
    }
}
