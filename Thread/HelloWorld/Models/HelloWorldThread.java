package Desafios.Thread.HelloWorld.Models;

public class HelloWorldThread extends Thread {
    public HelloWorldThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Hello, world and "+super.getName()+"!");
    }
}
