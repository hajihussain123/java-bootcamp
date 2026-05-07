package com.tw.bootcamp.problem2.domain;

import java.util.Objects;

public class Probability {

    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability of(double value) {
        return new Probability(value);
    }

    public static Probability not(double value) {
        return new Probability(1 - value);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability that)) return false;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Probability and(Probability otherChance) {
        return new Probability(this.value * otherChance.value);
    }
}
