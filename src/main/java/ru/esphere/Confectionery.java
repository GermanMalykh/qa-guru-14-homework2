package ru.esphere;

public class Confectionery {

    int temperature;
    int time;
    String name;

    public Confectionery(int temperature, int time, String name) {
        this.temperature = temperature;
        this.time = time;
        this.name = name;
    }

    void bake() {
        if (temperature < 180 || time < 60) {
            System.out.println(name + " are not ready!");
        } else if (temperature <= 240 & time <= 90) {
            System.out.println(name + " are ready!");
        } else if (temperature >= 240 & time >= 90) {
            System.out.println(name + " burned!");
        }
    }
}