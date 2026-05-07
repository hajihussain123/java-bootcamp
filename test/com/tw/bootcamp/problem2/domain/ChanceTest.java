package com.tw.bootcamp.problem2.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {

    @Test
    void shouldBeAbleToRepresentChanceOfTails() {
        Probability chanceOfGettingTails = new Probability(0.25);
        assertEquals(new Probability(0.25), chanceOfGettingTails);
    }

    @Test
    void shouldBeAbleToRepresentChanceNotGettingOfTails() {
        Probability chanceOfGettingTails = new Probability(0.25);
        Probability chanceOfNotGettingTails = chanceOfGettingTails.not();
        assertEquals(new Probability(0.75), chanceOfNotGettingTails);
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGettingTailsInTwoCoins() {
        Probability chanceOfGettingTailsInCoin1 = new Probability(0.25);
        Probability chanceOfGettingTailsInCoin2 = new Probability(0.5);
        Probability chanceOfGettingTailsInTwoCoins = chanceOfGettingTailsInCoin1.and(chanceOfGettingTailsInCoin2);
        assertEquals(new Probability(0.125), chanceOfGettingTailsInTwoCoins);
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGetting3InADice() {
        Probability chanceOfGetting3InADice = new Probability(0.167);
        assertEquals(new Probability(0.167), chanceOfGetting3InADice);
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGettingAtleastOneTailsInTwoCoins() {
        Probability chanceOfGettingTailsInCoin1 = new Probability(0.25);
        Probability chanceOfGettingTailsInCoin2 = new Probability(0.5);
        Probability chanceOfGettingTailsInTwoCoins = chanceOfGettingTailsInCoin1.or(chanceOfGettingTailsInCoin2);
        assertEquals(new Probability(0.625), chanceOfGettingTailsInTwoCoins);
    }
}