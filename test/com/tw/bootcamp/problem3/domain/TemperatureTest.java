package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {
    @Test
    void shouldReturnTrueFor100Cand212F() {
        Temperature hundredC = Temperature.create(100, TemperatureUnit.CELSIUS);
        Temperature twoTwelveF = Temperature.create(212, TemperatureUnit.FAHRENHEIT);
        assertEquals(hundredC, twoTwelveF);
    }
}