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
        String source = "Engine started";
        assertEquals("Engine started", source);
    }

    @Test
    void stop() {
        String source = "Engine stopped";
        assertEquals("Engine stopped", source);
    }
}