package com.tw.bootcamp.problem2.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CoinTest {
    @Test

    void shouldReturnProbability() {
        Coin coinSpy =  spy(new Coin());

        when(coinSpy.flip()).thenReturn("Tails");

        double tailsCount = coinSpy.chanceOfTails(10);
        assertEquals(10, tailsCount);
    }
}