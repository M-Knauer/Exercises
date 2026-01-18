package Desafios.Thread.HelloWorld.Models;

public class HelloWorldThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello, world!");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
