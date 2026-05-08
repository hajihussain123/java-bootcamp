package com.tw.bootcamp.problem3.domain;

public class Gallon implements Volume{
    private final double quantity;

    public Gallon(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public Litre convertToBase() {
        return new Litre(this.quantity * 3.78);
    }
}
