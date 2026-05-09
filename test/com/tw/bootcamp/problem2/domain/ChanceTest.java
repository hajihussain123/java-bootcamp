package com.tw.bootcamp.problem2.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChanceTest {

    @Test
    void shouldBeAbleToRepresentChanceOfTails() {
        Chance chanceOfGettingTails = Chance.create(0.25);
        assertEquals(Chance.create(0.25), chanceOfGettingTails);
    }

    @Test
    void shouldThrowExceptionForInvalidProbability() {
        InvalidProbabilityCreationException invalidProbabilityException1 = assertThrows(InvalidProbabilityCreationException.class, () -> Chance.create(2));
        InvalidProbabilityCreationException invalidProbabilityException2 = assertThrows(InvalidProbabilityCreationException.class, () -> Chance.create(-1));
        assertEquals("Probability should be within 0 and 1", invalidProbabilityException1.getMessage());
        assertEquals("Probability should be within 0 and 1", invalidProbabilityException2.getMessage());
    }

    @Test
    void shouldBeAbleToRepresentChanceNotGettingOfTails() {
        Chance chanceOfGettingTails = Chance.create(0.25);
        Chance chanceOfNotGettingTails = chanceOfGettingTails.not();
        assertEquals(Chance.create(0.75), chanceOfNotGettingTails);
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGettingTailsInTwoCoins() {
        Chance chanceOfGettingTailsInCoin1 = Chance.create(0.25);
        Chance chanceOfGettingTailsInCoin2 = Chance.create(0.5);
        Chance chanceOfGettingTailsInTwoCoins = chanceOfGettingTailsInCoin1.and(chanceOfGettingTailsInCoin2);
        assertEquals(Chance.create(0.125), chanceOfGettingTailsInTwoCoins);
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGetting3InADice() {
        Chance chanceOfGetting3InADice = Chance.create(0.167);
        assertEquals(Chance.create(0.167), chanceOfGetting3InADice);
    }

    @Test
    void shouldBeAbleToRepresentChanceOfGettingAtleastOneTailsInTwoCoins() {
        Chance chanceOfGettingTailsInCoin1 = Chance.create(0.25);
        Chance chanceOfGettingTailsInCoin2 = Chance.create(0.5);
        Chance chanceOfGettingTailsInTwoCoins = chanceOfGettingTailsInCoin1.or(chanceOfGettingTailsInCoin2);
        assertEquals(Chance.create(0.625), chanceOfGettingTailsInTwoCoins);
    }
}