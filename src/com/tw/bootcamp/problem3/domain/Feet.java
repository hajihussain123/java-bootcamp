package com.tw.bootcamp.problem3.domain;

public class Feet implements Unit{
    private final double length;

    public Feet(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Feet feet)) return false;
        return Double.compare(length, feet.length) == 0;
    }

    @Override
    public Inch convertToBase() {
        return  new Inch(this.length * 12);
    }
}
