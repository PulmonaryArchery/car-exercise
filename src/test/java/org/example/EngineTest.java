package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    Engine engine = new Engine("Electric", 500);

    @Test
    void testEngineConstructor() {
        Assertions.assertEquals("Electric", engine.getType());
        Assertions.assertEquals(500, engine.getHorsepower());
    }

    @Test
    void testStart() {
        assertEquals("Engine started", engine.start());
    }

    @Test
    void testStop() {
        assertEquals("Engine stopped", engine.stop());
    }

}