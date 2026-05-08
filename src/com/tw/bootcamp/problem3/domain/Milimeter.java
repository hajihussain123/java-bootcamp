package com.tw.bootcamp.problem3.domain;

public class Milimeter implements Length {
    private final double length;

    private Milimeter(double length) {
        this.length = length;
    }

    public static Milimeter create(double length) throws InvalidUnitCreationException {
        if (length < 0) {
            throw new InvalidUnitCreationException("Length can't be negative");
        }
        return new Milimeter(length);
    }

    @Override
    public Inch convertToBase() {
        return Inch.create(this.length / 25);
    }
}
