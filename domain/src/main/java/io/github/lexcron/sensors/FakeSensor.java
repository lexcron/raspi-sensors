package io.github.lexcron.sensors;

public class FakeSensor implements Sensor {

    @Override
    public String name() {
        return "Fake sensor";
    }

    @Override
    public double read() {
        return 21.5;
    }
}