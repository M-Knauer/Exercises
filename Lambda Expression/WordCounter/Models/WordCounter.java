package Desafios.LambdaExpression.WordCounter.Models;

import java.util.List;

@FunctionalInterface
public interface WordCounter {
    int count(String sentence);
}
