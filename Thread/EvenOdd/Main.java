package Desafios.Thread.EvenOdd;

import java.util.stream.IntStream;

public class Main {
    private static final Object lock = new Object();
    private static int status = 2;
    public static void main(String[] args) {

        Thread even = new Thread(() -> {
            for (int i = 0; i <= 20; i+=2) {
                synchronized (lock) {
                    while (status != 2) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    status = 1;
                    System.out.println("Even: "+i);
                    lock.notify();
                }
            }
        });

        Thread odd = new Thread(() -> {
            for (int i = 1; i < 20; i+=2) {
                synchronized (lock) {
                    while (status != 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    status = 2;
                    System.out.println("Odd: "+i);
                    lock.notify();
                }
            }
        });

        even.start();
        odd.start();
    }
}
