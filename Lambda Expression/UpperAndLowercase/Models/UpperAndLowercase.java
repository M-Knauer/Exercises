package Desafios.LambdaExpression.UpperAndLowercase.Models;

import java.util.ArrayList;
import java.util.List;

public class UpperAndLowercase {
    private List<String> uppercases;
    private List<String> lowercases;

    public UpperAndLowercase(List<String> uppercases, List<String> lowercases) {
        this.uppercases = uppercases;
        this.lowercases = lowercases;
    }

    public UpperAndLowercase() {
        uppercases = new ArrayList<>();
        lowercases = new ArrayList<>();
    }

    public List<String> getUppercases() {
        return uppercases;
    }

    public void setUppercases(List<String> uppercases) {
        this.uppercases = uppercases;
    }

    public List<String> getLowercases() {
        return lowercases;
    }

    public void setLowercases(List<String> lowercases) {
        this.lowercases = lowercases;
    }
}
