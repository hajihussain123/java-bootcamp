package com.tw.bootcamp.problem4.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotTest {

    @Test
    void ShouldReturnConfirmationAfterSuccessfulParkingOfCar() {
        ParkingLot parkingLot = ParkingLot.create(3);
        Car car = new Car("Black");
        assertTrue(parkingLot.park(car));
    }

    @Test
    void ShouldNotifyWhenLotIsFull(){
        ParkingLot parkingLot = ParkingLot.create(2);
        Car car1 = new Car("Black");
        Car car2 = new Car("Black");
        assertTrue(parkingLot.park(car1));
        assertFalse(parkingLot.isFull());
        assertTrue(parkingLot.park(car2));
        assertTrue(parkingLot.isFull());
    }

    @Test
    void ShouldReturnTrueWhenCarIsParkedInAnyOfTheParkingLots() {
        ParkingLot parkingLot1 = ParkingLot.create(2);
        ParkingLot parkingLot2 = ParkingLot.create(3);
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(parkingLot1);
        parkingLots.add(parkingLot2);
        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots);
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
        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots);
        Car car1 = new Car("Black");
        Car car2 = new Car("Black");
        Car car3 = new Car("Black");
        assertTrue(parkingLotAttendant.park(car1));
        assertTrue(parkingLotAttendant.park(car2));
        assertFalse(parkingLotAttendant.park(car3));
    }
}