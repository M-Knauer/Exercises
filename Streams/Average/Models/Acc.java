package Desafios.Streams.Average.Models;

public class Acc {
    public double weightedSum;
    public int weightSum;

    public Acc(double weightedSum, int weightSum) {
        this.weightedSum = weightedSum;
        this.weightSum = weightSum;
    }

    public Acc() {
    }
}
