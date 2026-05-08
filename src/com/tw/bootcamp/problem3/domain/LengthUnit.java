package com.tw.bootcamp.problem3.domain;

public enum LengthUnit {
    INCH(1),
    FEET(12),
    CENTIMETER(0.4),
    MILLIMETER(0.04);

    public final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
