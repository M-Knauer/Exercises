package Desafios.POO.Traffic;

public class Main {
    public static void main(String[] args) {

        TrafficLight t = new TrafficLight(30, TrafficColor.VERMELHO);
        t.setDuration(10);
        System.out.println(t.checkColor());
        t.changeColor(TrafficColor.AMARELO);
        System.out.println(t.checkColor());
        System.out.println(t.getDuration());

        if (t.isGreen()) {
            System.out.println("Sinal verde!");
        } else if (t.isRed()) {
            System.out.println("Sinal vermelho!");
        } else {
            System.out.println("Sinal amarelo!");
        }

    }
}
