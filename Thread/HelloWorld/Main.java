package Desafios.Thread.HelloWorld;

import Desafios.Thread.HelloWorld.Models.HelloWorldThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            System.out.printf("""
                    Hello, world!
                    Thread id: %d
                    Thread priority: %d
                    """, Thread.currentThread().getId(), Thread.currentThread().getPriority());
        });
        thread.start();
    }
}
