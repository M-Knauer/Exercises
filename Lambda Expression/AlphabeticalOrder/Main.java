package Desafios.LambdaExpression.AlphabeticalOrder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("red", "green", "blue", "black", "pink", "grey", "purple"));

        stringList.sort((c1, c2) -> c1.compareToIgnoreCase(c2));
        System.out.println(stringList);

    }
}
