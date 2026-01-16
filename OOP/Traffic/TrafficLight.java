package Desafios.POO.Traffic;

public class TrafficLight {
    private double duration;
    private TrafficColor color;

    public TrafficLight() {}

    public TrafficLight(double duration, TrafficColor color) {
        this.duration = duration;
        this.color = color;
    }

    public TrafficColor checkColor() {
        return color;
    }

    public boolean isGreen() {
        return color.toString().equals("VERDE");
    }

    public boolean isRed() {
        return color.toString().equals("VERMELHO");
    }

    public void changeColor(TrafficColor color) {
        this.color = color;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public TrafficColor getColor() {
        return color;
    }

    public void setColor(TrafficColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "duration=" + duration +
                ", colors=" + color +
                '}';
    }
}
