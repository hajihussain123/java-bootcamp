package com.tw.bootcamp.problem4.domain;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotAttendantTest {

    @Test
    void ShouldReturnTrueWhenCarIsParkedInAnyOfTheParkingLots() {
        ParkingLot parkingLot1 = ParkingLot.create(2);
        ParkingLot parkingLot2 = ParkingLot.create(3);

        Map<Integer, ParkingLot> parkingLots = new HashMap<>();
        parkingLots.put(1, parkingLot1);
        parkingLots.put(2, parkingLot2);

        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();

        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots, parkingLotAssistant);

        Car car = new Car("Black");

        assertTrue(parkingLotAttendant.park(car));
    }

    @Test
    void ShouldReturnFalseWhenAllParkingLotsAreFull() {
        ParkingLot parkingLot1 = ParkingLot.create(1);
        ParkingLot parkingLot2 = ParkingLot.create(1);

        Map<Integer, ParkingLot> parkingLots = new HashMap<>();
        parkingLots.put(1, parkingLot1);
        parkingLots.put(2, parkingLot2);

        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();

        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots, parkingLotAssistant);

        Car car1 = new Car("Black");
        Car car2 = new Car("Black");
        Car car3 = new Car("Black");

        assertTrue(parkingLotAttendant.park(car1));
        assertTrue(parkingLotAttendant.park(car2));
        assertFalse(parkingLotAttendant.park(car3));
    }

    @Test
    void ShouldReturnTrueWhenParkingLotIs80PercentFull() {
        ParkingLot parkingLot1 = ParkingLot.create(5);

        Map<Integer, ParkingLot> parkingLots = new HashMap<>();
        parkingLots.put(1, parkingLot1);

        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();

        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots, parkingLotAssistant);

        Car car1 = new Car("Black");
        Car car2 = new Car("Black");
        Car car3 = new Car("Black");
        Car car4 = new Car("Black");

        assertTrue(parkingLotAttendant.park(car1));
        assertFalse(parkingLotAttendant.isLot80PercentFull(1));
        assertTrue(parkingLotAttendant.park(car2));
        assertFalse(parkingLotAttendant.isLot80PercentFull(1));
        assertTrue(parkingLotAttendant.park(car3));
        assertFalse(parkingLotAttendant.isLot80PercentFull(1));
        assertTrue(parkingLotAttendant.park(car4));
        assertTrue(parkingLotAttendant.isLot80PercentFull(1));
    }
}