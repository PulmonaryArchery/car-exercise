package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    Car car = new Car("Toyota", "Yaris", 2017, 55, new Engine("Electric", 500));

    @Test
    void carConstructorTest() {
        Assertions.assertEquals("Toyota", car.getBrand());
        Assertions.assertEquals("Yaris", car.getModel());
        Assertions.assertEquals(2017, car.getYear());
        Assertions.assertEquals(55, car.getSpeed());
        Assertions.assertEquals(Engine.class, car.getEngine().getClass());
    }

    @Test
    void carConstructorTestWithNegativeSpeed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("Toyota", "Yaris",
                2017, -5, new Engine("Electric", 500)));
    }

}