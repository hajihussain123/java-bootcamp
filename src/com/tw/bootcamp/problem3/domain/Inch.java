package com.tw.bootcamp.problem3.domain;

public class Inch{
    private final double length;

    public Inch(double length) {
        this.length = length;
    }

    public Feet convertToFeet() {
        return  new Feet(this.length / 12);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Inch inch)) return false;
        return Double.compare(length, inch.length) == 0;
    }
}
