package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    public void carConstructorTest() {
        Car car = new Car("Toyota", "Yaris", 2017, 55);
        Assertions.assertEquals("Toyota", car.getBrand());
        Assertions.assertEquals("Yaris", car.getModel());
        Assertions.assertEquals(2017, car.getYear());
        Assertions.assertEquals(55, car.getSpeed());
    }

}