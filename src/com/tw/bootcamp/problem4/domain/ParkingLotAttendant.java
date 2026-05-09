package com.tw.bootcamp.problem4.domain;

import java.util.List;

public class ParkingLotAttendant {
    private final List<ParkingLot> parkingLots;

    public ParkingLotAttendant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public boolean park(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (!parkingLot.isFull()) return parkingLot.park(car);
        }

        return false;
    }
}
