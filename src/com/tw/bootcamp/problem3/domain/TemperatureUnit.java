package com.tw.bootcamp.problem3.domain;

public enum TemperatureUnit {
    FAHRENHEIT {
        @Override
        double toStandard(double temperature) {
            return (temperature - 32) * 5 / 9;
        }
    }, CELSIUS {
        @Override
        double toStandard(double temperature) {
            return temperature;
        }
    };

    abstract double toStandard(double temperature);
}
