package com.tw.bootcamp.problem3.domain;

public class Feet implements Unit{
    private final double length;

    public Feet(double length) {
        this.length = length;
    }

    @Override
    public Inch convertToBase() {
        return  new Inch(this.length * 12);
    }
}
