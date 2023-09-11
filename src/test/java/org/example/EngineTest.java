package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    Engine engine = new Engine("Electric", 500);

    @Test
    public void engineConstructorTest() {
        Assertions.assertEquals("Electric", engine.getType());
        Assertions.assertEquals(500, engine.getHorsepower());
    }

    @Test
    void start() {
        assertEquals("Engine started", engine.start());
    }

    @Test
    void stop() {
        assertEquals("Engine stopped", engine.stop());
    }

}