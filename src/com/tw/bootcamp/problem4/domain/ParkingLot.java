package com.tw.bootcamp.problem4.domain;

import java.util.ArrayList;

public class ParkingLot {

    private final ArrayList<Car> lot;
    private final int totalSlots;

    private ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.lot = new ArrayList<>();
    }

    public static ParkingLot create(int totalSlots) throws InvalidSlotsInParkingLotCreationException {
        if(totalSlots < 1) {
            throw new InvalidSlotsInParkingLotCreationException("Can't create parkinglot with no slots");
        }
        return new ParkingLot(totalSlots);
    }

    public boolean park(Car car) {
        this.lot.add(car);

        return true;
    }

    public boolean isFull() {
        return lot.size() == totalSlots;
    }
}
