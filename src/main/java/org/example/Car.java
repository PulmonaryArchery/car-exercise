package org.example;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int speed;
    private Engine engine;

    public Car(String brand, String model, int year, int speed, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        if (speed < 0) {
            throw new IllegalArgumentException("Illegal speed argument <" + speed + ">. " +
                    "Speed must be a positive number");
        } else {
            this.speed = speed;
        }
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {

        if (speed >= 5) {
            speed -= 5;
        } else {
            System.out.println("Speed can not go lower than 0mph.");
        }
    }

    public void honk() {
        System.out.println("Beep Beep!");
    }

    public void displayInfo() {
        System.out.println("Brand = " + brand + "\nModel = " + model
                + "\nYear = " + year + "\nCurrent Speed = " + speed);
    }

}
