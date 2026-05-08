package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {

    @Test
    void ShouldReturn12InchFor1Ft() {
        Feet oneFeet = new Feet(1);
        assertEquals(new Inch(12),oneFeet.convertToBase());
    }
}