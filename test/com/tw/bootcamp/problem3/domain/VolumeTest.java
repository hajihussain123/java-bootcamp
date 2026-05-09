package com.tw.bootcamp.problem3.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class VolumeTest {
    @Test
    void ShouldReturnTrueFor1GallonAnd3Point78Litres() {
        Volume oneGallon = Volume.create(1, VolumeUnit.GALLON);
        Volume threePointSevenEightLitre = Volume.create(3.78, VolumeUnit.LITRE);
        assertEquals(oneGallon, threePointSevenEightLitre);
    }

    @Test
    void ShouldReturnTrueFor2GallonAnd7Point56Litres() {
        Volume twoGallon = Volume.create(2, VolumeUnit.GALLON);
        Volume sevenPointFiveSixLitre = Volume.create(7.56, VolumeUnit.LITRE);
        assertEquals(twoGallon, sevenPointFiveSixLitre);
    }

    @Test
    void ShouldReturnFalseFor1GallonAnd2Point78Litres() {
        Volume oneGallon = Volume.create(1, VolumeUnit.GALLON);
        Volume threePointSevenEightLitre = Volume.create(2.78, VolumeUnit.LITRE);
        assertNotEquals(oneGallon, threePointSevenEightLitre);
    }

    @Test
    void shouldReturn4Point78LitresforAdding1LitreAnd1Gallon() {
        Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        Volume oneLitre = new Volume(1, VolumeUnit.LITRE);
        assertEquals(new Volume(4.78, VolumeUnit.LITRE), oneGallon.add(oneLitre));
    }

}