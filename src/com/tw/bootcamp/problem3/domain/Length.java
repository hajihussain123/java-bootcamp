package com.tw.bootcamp.problem3.domain;

public class Length {

    private final double length;
    private final LengthUnit lengthUnit;

    public Length(double length, LengthUnit lengthUnit) {
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public static Length create(double length, LengthUnit lengthUnit) {
        return new Length(length, lengthUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length1)) return false;
        return Math.abs(convertValueToInch() - length1.convertValueToInch()) <= 0.1;
    }

    private double convertValueToInch() {
        return this.lengthUnit.conversionFactor * this.length;
    }

    public Length add(Length other) {
        return new Length(convertValueToInch() + other.convertValueToInch(), LengthUnit.INCH);
    }
}
