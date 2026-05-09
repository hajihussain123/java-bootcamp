package com.tw.bootcamp.problem4.domain;

import java.util.List;

public class ParkingLotAttendant {
    private final List<ParkingLot> parkingLots;
    private final ParkingLotAssistant parkingLotAssistant;

    public ParkingLotAttendant(List<ParkingLot> parkingLots, ParkingLotAssistant parkingLotAssistant) {
        this.parkingLots = parkingLots;
        this.parkingLotAssistant = parkingLotAssistant;
    }

    public boolean park(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (!parkingLotAssistant.isFull(parkingLot)) return parkingLot.park(car);
        }

        return false;
    }
}
