package com.tw.bootcamp.problem2.domain;

public class Probability {

    private final double value;

    Probability(double value) {
        this.value = value;
    }

    public Probability not() {
        return new Probability(1 - this.value);
    }

    public Probability and(Probability otherChance) {
        return new Probability(this.value * otherChance.value);
    }

    public Probability or(Probability otherChance) {
        return new Probability((this.value + otherChance.value) - (this.value * otherChance.value));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability that)) return false;
        return Double.compare(value, that.value) == 0;
    }
}
