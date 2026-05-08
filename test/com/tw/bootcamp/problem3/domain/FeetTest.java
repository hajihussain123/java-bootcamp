package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {

    @Test
    void ShouldReturn12InchFor1Ft() {
        Feet oneFeet = Feet.create(1);
        assertEquals(Inch.create(12),oneFeet.convertToBase());
    }
}