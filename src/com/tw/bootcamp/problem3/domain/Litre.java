package com.tw.bootcamp.problem3.domain;

public class Litre implements Volume{
    private final double volume;

    private Litre(double volume) {
        this.volume = volume;
    }

    public static Litre create(double volume) throws InvalidUnitCreationException{
        if (volume < 0) {
            throw new InvalidUnitCreationException("Volume can't be negative");
        }
        return new Litre(volume);
    }

    @Override
    public Litre convertToBase() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Litre litre)) return false;
        return Double.compare(volume, litre.volume) == 0;
    }
}
