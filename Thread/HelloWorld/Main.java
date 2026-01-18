package Desafios.Thread.HelloWorld;

import Desafios.Thread.HelloWorld.Models.HelloWorldThread;

public class Main {
    public static void main(String[] args) {
        HelloWorldThread hwt = new HelloWorldThread("HelloThread");
        hwt.start();
    }
}
