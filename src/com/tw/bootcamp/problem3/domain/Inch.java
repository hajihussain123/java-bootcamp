package com.tw.bootcamp.problem3.domain;

public class Inch implements Length {
    private final double length;

    private Inch(double length) {
        this.length = length;
    }

    public static Inch create(double length) throws InvalidUnitCreationException {
        if (length < 0) {
            throw new InvalidUnitCreationException("Length can't be negative");
        }
        return new Inch(length);
    }

    @Override
    public Inch convertToBase() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Inch inch)) return false;
        return Double.compare(length, inch.length) == 0;
    }
}
