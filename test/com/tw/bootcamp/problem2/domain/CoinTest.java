package com.tw.bootcamp.problem2.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CoinTest {
    @Test

    void shouldReturnProbabilityOfGettingTails() {
        Coin coinSpy =  spy(new Coin());

        when(coinSpy.flip()).thenReturn(CoinFace.TAILS);

        double chances = coinSpy.chanceOfTails(10);
        assertEquals(100, chances);
    }

    @Test
    void shouldReturnProbabilityOfNotGettingTails() {
        Coin coinSpy =  spy(new Coin());

        when(coinSpy.flip()).thenReturn(CoinFace.TAILS);

        double chances = coinSpy.chanceOfNotGettingTails(10);
        assertEquals(0, chances);
    }
}