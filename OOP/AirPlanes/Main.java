package Desafios.POO.AirPlanes;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane("123456", "Rio de Janeiro",
                LocalTime.parse("11:45"), false);

        
        airPlane.checkStatus();
        airPlane.delay();

    }
}
