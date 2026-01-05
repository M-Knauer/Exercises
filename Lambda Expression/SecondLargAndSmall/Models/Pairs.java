package Desafios.LambdaExpression.SecondLargAndSmall.Models;

public class Pairs {
    public int largest;
    public int smallest;

    public Pairs(int largest, int smallest) {
        this.largest = largest;
        this.smallest = smallest;
    }

    @Override
    public String toString() {
        return largest+", "+smallest;
    }
}
