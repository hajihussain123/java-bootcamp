package com.tw.bootcamp.problem4.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void ShouldReturnConfirmationAfterSuccessfulParkingOfCar() {
        ParkingLot parkingLot = new ParkingLot(3);
        Car car = new Car("Black");
        assertTrue(parkingLot.park(car));
    }

    @Test
    void ShouldNotifyWhenLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(2);
        Car car1 = new Car("Black");
        Car car2 = new Car("Black");
        assertTrue(parkingLot.park(car1));
        assertFalse(parkingLot.isFull());
        assertTrue(parkingLot.park(car2));
        assertTrue(parkingLot.isFull());
    }

    @Test
    void ShouldNotifyParkingLotIsFullWhenITryToParkCarEvenAfterLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car1 = new Car("Black");
        Car car2 = new Car("Black");
        assertTrue(parkingLot.park(car1));
        assertFalse(parkingLot.park(car2));
    }
}