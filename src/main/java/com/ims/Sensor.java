package com.ims;

/**
 * Created by kubaw on 28/11/17.
 */
public class Sensor {
    private final String sensorName;
    private final String sensorValue;

    public Sensor(String sensorName, String sensorValue) {
        this.sensorName = sensorName;
        this.sensorValue = sensorValue;
    }

    public String getSensorName() {
        return this.sensorName;
    }

    public String getSensorValue() {
        return this.sensorValue;
    }
}
