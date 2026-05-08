package com.tw.bootcamp.problem3.domain;

import java.util.Objects;

public class Feet{
    private final double length;

    public Feet(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Feet feet)) return false;
        return Double.compare(length, feet.length) == 0;
    }

    public Inch convertToInch() {
        return  new Inch(this.length * 12);
    }
}
