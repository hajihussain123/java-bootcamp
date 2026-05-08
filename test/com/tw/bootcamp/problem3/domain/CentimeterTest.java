package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void ShouldReturn2InchFor5Cm() {
        Centimeter fiveCentimeter = Centimeter.create(5);
        assertEquals(Inch.create(2),fiveCentimeter.convertToBase());
    }
}