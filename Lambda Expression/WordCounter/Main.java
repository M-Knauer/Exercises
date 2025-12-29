package Desafios.LambdaExpression.WordCounter;

import Desafios.LambdaExpression.WordCounter.Models.WordCounter;

public class Main {
    public static void main(String[] args) {
        String sentence = "  Feliz ano novo para, todos !";
        System.out.println("Sentence: "+sentence);
        WordCounter wordCounter = s -> s.trim().split("\\s+").length;
        System.out.println("Word count: "+wordCounter.count(sentence));

        System.out.println("\nRemoving string punctuation");
        wordCounter = s -> s.trim().replaceAll("[,.;!?:]", "").split("\\s+").length;
        System.out.println(wordCounter.count(sentence));
    }
}
