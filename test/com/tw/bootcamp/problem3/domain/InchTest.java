package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {


    @Test
    void ShouldReturn12InchFor1Ft() {
        Inch oneInch = new Inch(1);
        assertEquals(new Inch(1), oneInch.convertToBase());
    }

    @Test
    void ShouldReturnFalseForUnequalUnits() {
        Inch oneInch = new Inch(1);
        Feet oneFeet = new Feet(1);
        assertNotEquals(oneInch, oneFeet);
    }

}