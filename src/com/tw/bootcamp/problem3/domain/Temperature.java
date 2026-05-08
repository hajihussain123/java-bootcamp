package com.tw.bootcamp.problem3.domain;

import java.util.Objects;

public class Temperature {

    private final double temperature;
    private final TemperatureUnit temperatureUnit;

    private Temperature(double temperature, TemperatureUnit temperatureUnit) {
        this.temperature = temperature;
        this.temperatureUnit = temperatureUnit;
    }


    public static Temperature create(double temperature, TemperatureUnit temperatureUnit) {
        return new Temperature(temperature, temperatureUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Temperature that)) return false;
        return Math.abs(this.temperatureUnit.toStandard(this.temperature) - that.temperatureUnit.toStandard(that.temperature)) <= 0.1;
    }
}
