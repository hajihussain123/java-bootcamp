package com.tw.bootcamp.problem3.domain;

public class Centimeter implements Length {
    private final double length;

    private Centimeter(double length) {
        this.length = length;
    }

    public static Centimeter create(double length) throws InvalidUnitCreationException {
        if (length < 0) {
            throw new InvalidUnitCreationException("Length can't be negative");
        }
        return new Centimeter(length);
    }

    @Override
    public Inch convertToBase() {
        return Inch.create(this.length * ((double) 2 / 5));
    }
}
