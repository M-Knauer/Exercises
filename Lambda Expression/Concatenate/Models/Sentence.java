package Desafios.LambdaExpression.Concatenate.Models;

import java.util.List;

@FunctionalInterface
public interface Sentence {
    String make(List<String> strings);
}
