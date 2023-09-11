package org.example;

public class Engine {

    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String start() {
        String start = "Engine started";
        System.out.println(start);
        return start;
    }

    public String stop() {
        String stop = "Engine stopped";
        System.out.println(stop);
        return stop;
    }

}
