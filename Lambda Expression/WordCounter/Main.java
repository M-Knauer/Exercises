package Desafios.LambdaExpression.WordCounter;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String sentence = "  Feliz ano novo para   todos !";
        System.out.println("Sentence: "+sentence);
        Function<String, Integer> wordCounter = s -> s.trim().split("\\s+").length;
        System.out.println("Word count: "+wordCounter.apply(sentence));
    }
}
