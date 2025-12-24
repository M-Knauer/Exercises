package Desafios.LambdaExpression.Factorial.Models;

import java.util.Map;

@FunctionalInterface
public interface Factorial <T> {
    T calculateFactorial(T n, Map<T, T> map);
}
