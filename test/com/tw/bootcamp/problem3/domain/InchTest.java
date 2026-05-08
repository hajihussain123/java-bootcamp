package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {


    @Test
    void ShouldReturn12InchFor1Ft() {
        Inch oneInch = Inch.create(1);
        assertEquals(Inch.create(1), oneInch.convertToBase());
    }

    @Test
    void ShouldReturnFalseForUnequalUnits() {
        Inch oneInch = Inch.create(1);
        Feet oneFeet = Feet.create(1);
        assertNotEquals(oneInch, oneFeet);
    }

}