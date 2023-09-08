package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    public void engineConstructorTest() {
        Engine engine = new Engine("Electric", 500);
        Assertions.assertEquals("Electric", engine.getType());
        Assertions.assertEquals(500, engine.getHorsepower());
    }

    @Test
    void start() {
        Engine engine = new Engine("Electric", 500);
        assertEquals("Engine started", engine.start());
    }

    @Test
    void stop() {
        Engine engine = new Engine("Electric", 500);
        assertEquals("Engine stopped", engine.stop());
    }
}