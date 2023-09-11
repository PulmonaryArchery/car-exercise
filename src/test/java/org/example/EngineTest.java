package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    private final Engine underTest = new Engine("Electric", 500);

    @Test
    void testEngineConstructor() {
        Assertions.assertEquals("Electric", underTest.getType());
        Assertions.assertEquals(500, underTest.getHorsepower());
    }

    @Test
    void testStart() {
        assertEquals("Engine started", underTest.start());
    }

    @Test
    void testStop() {
        assertEquals("Engine stopped", underTest.stop());
    }

}