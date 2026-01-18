package Desafios.Thread.HelloWorld.Models;

public class HelloWorldThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
}
