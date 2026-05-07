package com.tw.bootcamp.problem2.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

    @Test
    void shouldBeAbleToRepresentChanceOfTails() {
        Probability chanceOfGettingTails = Probability.of(0.25);
        assertTrue(chanceOfGettingTails.equals(Probability.of(0.25)));
    }

}