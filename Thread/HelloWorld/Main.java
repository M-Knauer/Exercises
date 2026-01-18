package Desafios.Thread.HelloWorld;

import Desafios.Thread.HelloWorld.Models.HelloWorldThread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello, world!"));
        thread.start();
    }
}
