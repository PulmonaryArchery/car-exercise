package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    private final Engine mockEngine = new Engine("Electric", 500);
    private final Car underTest = new Car("Toyota", "Yaris", 2017, 55, mockEngine);

    @Test
    void testCarConstructor() {
        Assertions.assertEquals("Toyota", underTest.getBrand());
        Assertions.assertEquals("Yaris", underTest.getModel());
        Assertions.assertEquals(2017, underTest.getYear());
        Assertions.assertEquals(55, underTest.getSpeed());
        Assertions.assertEquals(Engine.class, underTest.getEngine().getClass());
    }

    @Test
    void testCarConstructorTestWithNegativeSpeed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("Toyota", "Yaris",
                2017, -5, mockEngine));
    }

}