package com.tw.bootcamp.problem3.domain;

public class Litre implements Volume{
    private final double quantity;

    public Litre(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public Litre convertToBase() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Litre litre)) return false;
        return Double.compare(quantity, litre.quantity) == 0;
    }
}
