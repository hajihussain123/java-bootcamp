package com.tw.bootcamp.problem2.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

    @Test
    void shouldBeAbleToRepresentChanceOfTails() {
        Probability chanceOfGettingTails = Probability.of(0.25);
        assertEquals(chanceOfGettingTails, Probability.of(0.25));
    }

    @Test
    void shouldBeAbleToRepresentChanceNotGettingOfTails() {
        Probability chanceOfGettingTails = Probability.of(0.25);
        Probability chanceOfNotGettingTails = Probability.not(chanceOfGettingTails);
        assertEquals(chanceOfNotGettingTails, Probability.of(0.75));
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGettingTailsInTwoCoins() {
        Probability chanceOfGettingTailsInCoin1 = Probability.of(0.25);
        Probability chanceOfGettingTailsInCoin2 = Probability.of(0.5);
        Probability chanceOfGettingTailsInTwoCoins = chanceOfGettingTailsInCoin1.and(chanceOfGettingTailsInCoin2);
        assertEquals(chanceOfGettingTailsInTwoCoins, Probability.of(0.125));
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGetting3InADice() {
        Probability chanceOfGetting3InADice = Probability.of(0.167);
        assertEquals(chanceOfGetting3InADice, Probability.of(0.167));
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGettingAtleastOneTailsInTwoCoins() {
        Probability chanceOfGettingTailsInCoin1 = Probability.of(0.25);
        Probability chanceOfGettingTailsInCoin2 = Probability.of(0.5);
        Probability chanceOfGettingTailsInTwoCoins = chanceOfGettingTailsInCoin1.atleastOne(chanceOfGettingTailsInCoin2);
        assertEquals(chanceOfGettingTailsInTwoCoins, Probability.of(0.625));
    }
}