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

    @Test
    void ShouldReturnFalseFor2FtAnd12Inch() {
        Comparator comparator = new Comparator();
        Inch twelveInch = new Inch(12);
        Feet twoFeet = new Feet(2);
        assertFalse(comparator.isEquals(twoFeet,twelveInch));
    }

    @Test
    void ShouldReturnTrueFor5CmAnd2Inch() {
        Comparator comparator = new Comparator();
        Inch twoInch = new Inch(2);
        Centimeter fiveCm = new Centimeter(5);
        assertTrue(comparator.isEquals(fiveCm,twoInch));
    }

    @Test
    void ShouldReturnTrueFor2InchAnd5Cm() {
        Comparator comparator = new Comparator();
        Inch twoInch = new Inch(2);
        Centimeter fiveCm = new Centimeter(5);
        assertTrue(comparator.isEquals(twoInch,fiveCm));
    }

    @Test
    void ShouldReturnFalseFor6CmAnd2Inch() {
        Comparator comparator = new Comparator();
        Inch twoInch = new Inch(2);
        Centimeter fiveCm = new Centimeter(6);
        assertFalse(comparator.isEquals(fiveCm,twoInch));
    }
}