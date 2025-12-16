package Desafios.LambdaExpression.SumTwoNumbers.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OperateFile {
    public static List<Integer> getNumbers(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            return new ArrayList<>(List.of(Integer.parseInt(lines.get(0)),
                    Integer.parseInt(lines.get(1))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
