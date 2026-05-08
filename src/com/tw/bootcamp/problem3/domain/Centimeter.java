package com.tw.bootcamp.problem3.domain;

import java.util.Objects;

public class Centimeter implements Unit {
    private final double length;

    public Centimeter(double length) {
        this.length = length;
    }

    @Override
    public Inch convertToBase() {
        return new Inch(this.length * ((double) 2 / 5));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Centimeter that)) return false;
        return Double.compare(length, that.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }
}
