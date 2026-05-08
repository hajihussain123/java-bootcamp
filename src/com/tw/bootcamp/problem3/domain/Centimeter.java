package com.tw.bootcamp.problem3.domain;

public class Centimeter implements Unit {
    private final double length;

    public Centimeter(double length) {
        this.length = length;
    }

    @Override
    public Inch convertToBase() {
        return new Inch(this.length * ((double) 2 / 5));
    }
}
