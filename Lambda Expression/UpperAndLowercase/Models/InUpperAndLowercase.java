package Desafios.LambdaExpression.UpperAndLowercase.Models;

import java.util.List;

@FunctionalInterface
public interface InUpperAndLowercase {
    UpperAndLowercase getUpperLower(List<String> strings);
}
