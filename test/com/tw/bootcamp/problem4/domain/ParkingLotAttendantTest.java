package com.tw.bootcamp.problem4.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotAttendantTest {


    @Test
    void ShouldReturnTrueWhenCarIsParkedInAnyOfTheParkingLots() {
        ParkingLot parkingLot1 = ParkingLot.create(2);
        ParkingLot parkingLot2 = ParkingLot.create(3);

        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(parkingLot1);
        parkingLots.add(parkingLot2);

        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();

        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots, parkingLotAssistant);

        Car car = new Car("Black");

        assertTrue(parkingLotAttendant.park(car));
    }

    @Test
    void ShouldReturnFalseWhenAllParkingLotsAreFull() {
        ParkingLot parkingLot1 = ParkingLot.create(1);
        ParkingLot parkingLot2 = ParkingLot.create(1);

        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(parkingLot1);
        parkingLots.add(parkingLot2);

        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();

        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots, parkingLotAssistant);

        Car car1 = new Car("Black");
        Car car2 = new Car("Black");
        Car car3 = new Car("Black");

        assertTrue(parkingLotAttendant.park(car1));
        assertTrue(parkingLotAttendant.park(car2));
        assertFalse(parkingLotAttendant.park(car3));
    }
}