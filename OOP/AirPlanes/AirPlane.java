package Desafios.POO.AirPlanes;

import java.time.LocalTime;

public class AirPlane {
    private String number;
    private String destination;
    private LocalTime departureTime;
    private boolean flight;

    public AirPlane() {}

    public AirPlane(String number, String destination, LocalTime departureTime) {
        this.number = number;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public AirPlane(String number, String destination, LocalTime departureTime, boolean flight) {
        this(number, destination, departureTime);
        this.flight = flight;
    }

    public void checkStatus() {
        if (!flight) {
            System.out.println("The plane has not flown yet.");
        } else {
            System.out.println("The plane has already flown.");
        }

    }

    public void delay() {
        if (departureTime.isBefore(LocalTime.now()) && !flight) {
            System.out.println("The plane has been delayed by: "+ delayTime() +" minutes.");
        } else {
            System.out.println("The plane is on time.");
        }
    }

    private int delayTime() {
        if (!flight) {
            return toMinutes(departureTime, LocalTime.now());
        }
        return 0;
    }

    private static int toMinutes(LocalTime departureTime, LocalTime currentTime) {
        return Math.abs((departureTime.getHour() * 60 + departureTime.getMinute()) -
                (currentTime.getHour() * 60 + currentTime.getMinute()));
    }

    public boolean isFlight() {
        return flight;
    }

    public void setFlight(boolean flight) {
        this.flight = flight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
