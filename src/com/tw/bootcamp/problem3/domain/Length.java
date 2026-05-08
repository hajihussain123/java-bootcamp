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
        if (!(o instanceof Length that)) return false;
        return Math.abs(this.lengthUnit.toStandard(this.length) - that.lengthUnit.toStandard(that.length)) <= 0.1;
    }

    public Length add(Length other) {
        return new Length(this.lengthUnit.toStandard(this.length) + other.lengthUnit.toStandard(other.length), LengthUnit.INCH);
    }
}
