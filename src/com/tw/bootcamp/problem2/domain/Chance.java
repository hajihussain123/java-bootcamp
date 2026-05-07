package com.tw.bootcamp.problem2.domain;

public class Chance {

    private final double probability;

    private Chance(double probability) {
        this.probability = probability;
    }

    static Chance create(double value) throws InvalidProbabilityCreationException{
        if (value < 0 || value > 1) throw new InvalidProbabilityCreationException("Probability should be within 0 and 1");

        return new Chance(value);
    }

    public Chance not() {
        return create(1 - this.probability);
    }

    public Chance and(Chance otherChance) {
        return create(this.probability * otherChance.probability);
    }

    public Chance or(Chance otherChance) {
        return create((this.probability + otherChance.probability) - (this.probability * otherChance.probability));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Chance that)) return false;
        return Double.compare(probability, that.probability) == 0;
    }
}
