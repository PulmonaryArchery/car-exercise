package org.example;

public class Main {
    public static void main(String[] args) {
////        Car car = new Car("Toyota", "Yaris", 2017, -5);
////        car.accelerate();
////        car.brake();
//        car.honk();
//        car.displayInfo();
//        System.out.println(car.getSpeed());

        Engine engine = new Engine("Electric", 500);
        engine.start();
        engine.stop();

    }
}