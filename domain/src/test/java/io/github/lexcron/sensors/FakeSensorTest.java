package io.github.lexcron.sensors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FakeSensorTest {

    @Test
    void readReturnsFixedValue() {
        Sensor sensor = new FakeSensor();

        assertEquals(21.5, sensor.read());
    }
}