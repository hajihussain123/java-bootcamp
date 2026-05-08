package com.tw.bootcamp.problem3.domain;

public class Gallon implements Volume{
    private final double volume;

    private Gallon(double volume) {
        this.volume = volume;
    }

    public static Gallon create(double volume) throws InvalidUnitCreationException{
        if (volume < 0) {
            throw new InvalidUnitCreationException("Volume can't be negative");
        }
        return new Gallon(volume);
    }

    @Override
    public Litre convertToBase() {
        return Litre.create(this.volume * 3.78);
    }
}
