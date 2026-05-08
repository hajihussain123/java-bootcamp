package com.tw.bootcamp.problem3.domain;

public class Feet implements Length {
    private final double length;

    private Feet(double length) {
        this.length = length;
    }

    public static Feet create(double length) throws InvalidUnitCreationException{
        if (length < 0) {
            throw new InvalidUnitCreationException("Length can't be negative");
        }
        return new Feet(length);
    }

    @Override
    public Inch convertToBase() {
        return Inch.create(this.length * 12);
    }
}
