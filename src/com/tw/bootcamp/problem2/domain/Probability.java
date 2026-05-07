package com.tw.bootcamp.problem2.domain;

public class Probability {

    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability of(double value) {
        return new Probability(value);
    }

    public static Probability not(Probability otherChance) {
        return new Probability(1 - otherChance.value);
    }

    public Probability and(Probability otherChance) {
        return new Probability(this.value * otherChance.value);
    }

    public Probability atleastOne(Probability otherChance) {
        return new Probability((this.value + otherChance.value) - (this.value * otherChance.value));

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability that)) return false;
        return Double.compare(value, that.value) == 0;
    }
}
