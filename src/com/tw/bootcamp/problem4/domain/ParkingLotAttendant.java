package com.tw.bootcamp.problem4.domain;

import java.util.List;
import java.util.Map;

public class ParkingLotAttendant {
    private final Map<Integer, ParkingLot> parkingLots;
    private final ParkingLotAssistant parkingLotAssistant;

    public ParkingLotAttendant(Map<Integer, ParkingLot> parkingLots, ParkingLotAssistant parkingLotAssistant) {
        this.parkingLots = parkingLots;
        this.parkingLotAssistant = parkingLotAssistant;
    }

    public boolean park(Car car) {
        for (Map.Entry<Integer, ParkingLot> parkingLotEntry : parkingLots.entrySet()) {
            if (!parkingLotAssistant.isFull(parkingLotEntry.getValue())) return parkingLotEntry.getValue().park(car);
        }

        return false;
    }


    public boolean isLot80PercentFull(int parkingLotId) {
        return parkingLots.get(parkingLotId).is80PercentFull();
    }
}
