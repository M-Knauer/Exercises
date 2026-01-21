package Desafios.Thread.EvenOdd;

public class Main {
    private static final Object LOCK = new Object();
    private static int status = 1;
    private static final int LIMIT = 100;
    public static void main(String[] args) {

        Thread even = new Thread(() -> {
            for (int i = 2; i <= LIMIT; i+=2) {
                synchronized (LOCK) {
                    while (status != 2) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    status = 1;
                    System.out.println("Even: "+i);
                    LOCK.notify();
                }
            }
        });

        Thread odd = new Thread(() -> {
            for (int i = 1; i <= LIMIT; i+=2) {
                synchronized (LOCK) {
                    while (status != 1) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    status = 2;
                    System.out.println("Odd: "+i);
                    LOCK.notify();
                }
            }
        });

        even.start();
        odd.start();
        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All done!");
    }
}
