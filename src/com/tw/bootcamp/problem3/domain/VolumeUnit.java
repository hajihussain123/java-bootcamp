package com.tw.bootcamp.problem3.domain;

public enum VolumeUnit {
    GALLON(3.78),
    LITRE(1);

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toStandard(double volume) {
        return volume * conversionFactor;
    }
}
