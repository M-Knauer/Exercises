package Desafios.LambdaExpression.Concatenate.Models;

@FunctionalInterface
public interface Concatenate {
    String concat(String str1, String str2, String delimiter);
}
