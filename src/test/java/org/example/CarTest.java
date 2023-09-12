package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CarTest {

    private final Engine mockEngine = Mockito.mock(Engine.class);
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

    @Test
    void testStartCar() {
        underTest.startCar();
        Mockito.verify(mockEngine).start();
    }

    @Test
    void testStopCar() {
        underTest.stopCar();
        Mockito.verify(mockEngine).stop();
    }

}