package com.tw.bootcamp.problem4.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void ShouldReturnConfirmationAfterCarIsParked() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car("Black");
        assertEquals(new Notification("Car parked successfully"),parkingLot.park(car));
    }
}