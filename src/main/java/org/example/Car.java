package org.example;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int speed;

    public Car(String brand, String model, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
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
