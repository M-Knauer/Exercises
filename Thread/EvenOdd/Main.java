package Desafios.Thread.EvenOdd;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Thread even = new Thread(() -> {
            IntStream.rangeClosed(1, 20).filter(n -> n % 2 == 0)
                    .forEach(n -> System.out.println("Even: "+n));
        });

        Thread odd = new Thread(() -> {
            IntStream.rangeClosed(1, 20).filter(n -> n % 2 == 1)
                    .forEach(n -> System.out.println("Odd: "+n));
        });

        even.start();
        odd.start();
    }
}
