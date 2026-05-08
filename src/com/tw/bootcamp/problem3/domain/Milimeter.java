package com.tw.bootcamp.problem3.domain;

public class Milimeter implements Length {
    private final double length;

    public Milimeter(double length) {
        this.length = length;
    }

    @Override
    public Inch convertToBase() {
        return new Inch(this.length / 25);
    }
}
