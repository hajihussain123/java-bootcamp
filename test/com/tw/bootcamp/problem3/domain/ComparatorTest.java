package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    @Test
    void ShouldReturnTrueFor12InchAnd1Ft() {
        Comparator comparator = new Comparator();
        Inch twelveInch = new Inch(12);
        Feet oneFeet = new Feet(1);
        assertTrue(comparator.isEquals(twelveInch,oneFeet));
    }

    @Test
    void ShouldReturnTrueFor1FtAnd12Inch() {
        Comparator comparator = new Comparator();
        Inch twelveInch = new Inch(12);
        Feet oneFeet = new Feet(1);
        assertTrue(comparator.isEquals(oneFeet,twelveInch));
    }
}