package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthTest {
    @Test
    void ShouldReturnTrueFor12InchAnd1Ft() {
        Length twelveInch = Length.create(12, LengthUnit.INCH);
        Length oneFeet = Length.create(1, LengthUnit.FEET);
        assertEquals(twelveInch, oneFeet);
    }

    @Test
    void ShouldReturnTrueFor1FtAnd12Inch() {
        Length twelveInch = Length.create(12, LengthUnit.INCH);
        Length oneFeet = Length.create(1, LengthUnit.FEET);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void ShouldReturnFalseFor2FtAnd12Inch() {
        Length twelveInch = Length.create(12, LengthUnit.INCH);
        Length twoFeet = Length.create(2, LengthUnit.FEET);
        assertNotEquals(twoFeet, twelveInch);
    }

    @Test
    void ShouldReturnTrueFor5CmAnd2Inch() {
        Length twoInch = Length.create(2, LengthUnit.INCH);
        Length fiveCm = Length.create(5, LengthUnit.CENTIMETER);
        assertEquals(fiveCm, twoInch);
    }

    @Test
    void ShouldReturnTrueFor2InchAnd5Cm() {
        Length twoInch = Length.create(2, LengthUnit.INCH);
        Length fiveCm = Length.create(5, LengthUnit.CENTIMETER);
        assertEquals(twoInch, fiveCm);
    }

    @Test
    void ShouldReturnFalseFor6CmAnd2Inch() {
        Length twoInch = Length.create(2, LengthUnit.INCH);
        Length sixCm = Length.create(6, LengthUnit.CENTIMETER);
        assertNotEquals(twoInch, sixCm);
    }

    @Test
    void ShouldReturnTrueFor1cmAnd10Mm() {
        Length tenMm = Length.create(10, LengthUnit.MILLIMETER);
        Length oneCm = Length.create(1, LengthUnit.CENTIMETER);
        assertEquals(oneCm, tenMm);
    }

    @Test
    void ShouldReturnFalseFor3cmAnd10Mm() {
        Length tenMm = Length.create(10, LengthUnit.MILLIMETER);
        Length oneCm = Length.create(3, LengthUnit.CENTIMETER);
        assertNotEquals(oneCm, tenMm);
    }


    @Test
    void shouldReturn4InchforAdding2InchAnd2Inch() {
        Length twoInch1 = new Length(2, LengthUnit.INCH);
        Length twoInch2 = new Length(2, LengthUnit.INCH);
        assertEquals(new Length(4, LengthUnit.INCH), twoInch1.add(twoInch2));
    }

    @Test
    void shouldReturn3InchforAdding2InchAnd2Point5Cm() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length twoPointFiveCm = new Length(2.5, LengthUnit.CENTIMETER);
        assertEquals(new Length(3, LengthUnit.INCH), twoInch.add(twoPointFiveCm));
    }

}