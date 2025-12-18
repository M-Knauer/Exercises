package Desafios.LambdaExpression.UpperAndLowercase.Models;

import java.util.List;

@FunctionalInterface
public interface MixUpperAndLowercase {
    List<String> mixUpperAndLower(List<String> strings);
}
