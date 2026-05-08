package com.tw.bootcamp.problem3.domain;

public class Inch implements Unit{
    private final double length;

    public Inch(double length) {
        this.length = length;
    }

    @Override
    public Inch convertToBase() {
        return  this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Inch inch)) return false;
        return Double.compare(length, inch.length) == 0;
    }
}
