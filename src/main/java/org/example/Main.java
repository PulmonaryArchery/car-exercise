package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Yaris", 2017, 55);
        car.accelerate();
        car.brake();
        car.honk();
        car.displayInfo();
    }
}