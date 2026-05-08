package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    @Test
    void ShouldReturnTrueFor12InchAnd1Ft() {
        Inch twelveInch = Inch.create(12);
        Feet oneFeet = Feet.create(1);
        assertTrue(Comparator.compareLengths(twelveInch,oneFeet));
    }

    @Test
    void ShouldReturnTrueFor1FtAnd12Inch() {
        Inch twelveInch = Inch.create(12);
        Feet oneFeet = Feet.create(1);
        assertTrue(Comparator.compareLengths(oneFeet,twelveInch));
    }

    @Test
    void ShouldReturnFalseFor2FtAnd12Inch() {
        Inch twelveInch = Inch.create(12);
        Feet twoFeet = Feet.create(2);
        assertFalse(Comparator.compareLengths(twoFeet,twelveInch));
    }

    @Test
    void ShouldReturnTrueFor5CmAnd2Inch() {
        Inch twoInch = Inch.create(2);
        Centimeter fiveCm = Centimeter.create(5);
        assertTrue(Comparator.compareLengths(fiveCm,twoInch));
    }

    @Test
    void ShouldReturnTrueFor2InchAnd5Cm() {
        Inch twoInch = Inch.create(2);
        Centimeter fiveCm = Centimeter.create(5);
        assertTrue(Comparator.compareLengths(twoInch,fiveCm));
    }

    @Test
    void ShouldReturnFalseFor6CmAnd2Inch() {
        Inch twoInch = Inch.create(2);
        Centimeter fiveCm = Centimeter.create(6);
        assertFalse(Comparator.compareLengths(fiveCm,twoInch));
    }

    @Test
    void ShouldReturnTrueFor1cmAnd10Mm() {
        Milimeter tenMm = Milimeter.create(10);
        Centimeter oneCm = Centimeter.create(1);
        assertTrue(Comparator.compareLengths(oneCm,tenMm));
    }

    @Test
    void ShouldReturnFalseFor3cmAnd10Mm() {
        Milimeter tenMm = Milimeter.create(10);
        Centimeter oneCm = Centimeter.create(3);
        assertFalse(Comparator.compareLengths(oneCm,tenMm));
    }

    @Test
    void ShouldReturnTrueFor1GallonAnd3Point78Litres() {
        Gallon oneGallon = Gallon.create(1);
        Litre threePointSevenEightLitre = Litre.create(3.78);
        assertTrue(Comparator.compareVolumes(oneGallon,threePointSevenEightLitre));
    }

    @Test
    void ShouldReturnTrueFor2GallonAnd7Point56Litres() {
        Gallon twoGallon = Gallon.create(2);
        Litre sevenPointFiveSixLitre = Litre.create(7.56);
        assertTrue(Comparator.compareVolumes(sevenPointFiveSixLitre,twoGallon));
    }

    @Test
    void ShouldReturnFalseFor1GallonAnd2Point78Litres() {
        Gallon oneGallon = Gallon.create(1);
        Litre threePointSevenEightLitre = Litre.create(2.78);
        assertFalse(Comparator.compareVolumes(oneGallon,threePointSevenEightLitre));
    }

    @Test
    void ShouldNotCreateInchForNegativeLength() {
        InvalidUnitCreationException exception = assertThrows(InvalidUnitCreationException.class, ()->Inch.create(-1));
        assertEquals("Length can't be negative", exception.getMessage());
    }

    @Test
    void ShouldNotCreateFeetForNegativeLength() {
        InvalidUnitCreationException exception = assertThrows(InvalidUnitCreationException.class, ()->Feet.create(-1));
        assertEquals("Length can't be negative", exception.getMessage());
    }

    @Test
    void ShouldNotCreateCentimeterForNegativeLength() {
        InvalidUnitCreationException exception = assertThrows(InvalidUnitCreationException.class, ()->Centimeter.create(-1));
        assertEquals("Length can't be negative", exception.getMessage());
    }

    @Test
    void ShouldNotCreateMilimeterForNegativeLength() {
        InvalidUnitCreationException exception = assertThrows(InvalidUnitCreationException.class, ()->Milimeter.create(-1));
        assertEquals("Length can't be negative", exception.getMessage());
    }

    @Test
    void ShouldNotCreateGallonForNegativeLength() {
        InvalidUnitCreationException exception = assertThrows(InvalidUnitCreationException.class, ()->Gallon.create(-1));
        assertEquals("Volume can't be negative", exception.getMessage());
    }

    @Test
    void ShouldNotCreateLitreForNegativeLength() {
        InvalidUnitCreationException exception = assertThrows(InvalidUnitCreationException.class, ()->Litre.create(-1));
        assertEquals("Volume can't be negative", exception.getMessage());
    }
}