package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    @Test
    void ShouldReturnTrueFor12InchAnd1Ft() {
        Comparator comparator = new Comparator();
        Inch twelveInch = new Inch(12);
        Feet oneFeet = new Feet(1);
        assertTrue(comparator.compareLengths(twelveInch,oneFeet));
    }

    @Test
    void ShouldReturnTrueFor1FtAnd12Inch() {
        Comparator comparator = new Comparator();
        Inch twelveInch = new Inch(12);
        Feet oneFeet = new Feet(1);
        assertTrue(comparator.compareLengths(oneFeet,twelveInch));
    }

    @Test
    void ShouldReturnFalseFor2FtAnd12Inch() {
        Comparator comparator = new Comparator();
        Inch twelveInch = new Inch(12);
        Feet twoFeet = new Feet(2);
        assertFalse(comparator.compareLengths(twoFeet,twelveInch));
    }

    @Test
    void ShouldReturnTrueFor5CmAnd2Inch() {
        Comparator comparator = new Comparator();
        Inch twoInch = new Inch(2);
        Centimeter fiveCm = new Centimeter(5);
        assertTrue(comparator.compareLengths(fiveCm,twoInch));
    }

    @Test
    void ShouldReturnTrueFor2InchAnd5Cm() {
        Comparator comparator = new Comparator();
        Inch twoInch = new Inch(2);
        Centimeter fiveCm = new Centimeter(5);
        assertTrue(comparator.compareLengths(twoInch,fiveCm));
    }

    @Test
    void ShouldReturnFalseFor6CmAnd2Inch() {
        Comparator comparator = new Comparator();
        Inch twoInch = new Inch(2);
        Centimeter fiveCm = new Centimeter(6);
        assertFalse(comparator.compareLengths(fiveCm,twoInch));
    }

    @Test
    void ShouldReturnTrueFor1cmAnd10Mm() {
        Comparator comparator = new Comparator();
        Milimeter tenMm = new Milimeter(10);
        Centimeter oneCm = new Centimeter(1);
        assertTrue(comparator.compareLengths(oneCm,tenMm));
    }

    @Test
    void ShouldReturnFalseFor3cmAnd10Mm() {
        Comparator comparator = new Comparator();
        Milimeter tenMm = new Milimeter(10);
        Centimeter oneCm = new Centimeter(3);
        assertFalse(comparator.compareLengths(oneCm,tenMm));
    }

    @Test
    void ShouldReturnTrueFor1GallonAnd3Point78Litres() {
        Comparator comparator = new Comparator();
        Gallon oneGallon = new Gallon(1);
        Litre threePointSevenEightLitre = new Litre(3.78);
        assertTrue(comparator.compareVolumes(oneGallon,threePointSevenEightLitre));
    }

    @Test
    void ShouldReturnTrueFor2GallonAnd7Point56Litres() {
        Comparator comparator = new Comparator();
        Gallon twoGallon = new Gallon(2);
        Litre sevenPointFiveSixLitre = new Litre(7.56);
        assertTrue(comparator.compareVolumes(sevenPointFiveSixLitre,twoGallon));
    }

    @Test
    void ShouldReturnFalseFor1GallonAnd2Point78Litres() {
        Comparator comparator = new Comparator();
        Gallon oneGallon = new Gallon(1);
        Litre threePointSevenEightLitre = new Litre(2.78);
        assertFalse(comparator.compareVolumes(oneGallon,threePointSevenEightLitre));
    }
}