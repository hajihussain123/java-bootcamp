package com.tw.bootcamp.problem4.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void ShouldReturnConfirmationAfterSuccessfulParkingOfCar() {
        ParkingLot parkingLot = ParkingLot.create(3);
        Car car = new Car("Black");
        assertTrue(parkingLot.park(car));
    }

    @Test
    void ShouldNotCreateParkingLotForLessThan1Slot() {
        InvalidSlotsInParkingLotCreationException exception = assertThrows(InvalidSlotsInParkingLotCreationException.class, () -> ParkingLot.create(0));
        assertEquals("Can't create parkinglot with no slots", exception.getMessage());
    }

    @Test
    void ShouldNotifyWhenLotIsFull() {
        ParkingLot parkingLot = ParkingLot.create(2);
        Car car1 = new Car("Black");
        Car car2 = new Car("Black");

        assertTrue(parkingLot.park(car1));
        assertFalse(parkingLot.isFull());
        assertTrue(parkingLot.park(car2));
        assertTrue(parkingLot.isFull());
    }
}