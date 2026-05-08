package com.tw.bootcamp.problem4.domain;

import java.util.ArrayList;

public class ParkingLot {

    private final ArrayList<Car> lot;
    private final int totalSlots;

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.lot = new ArrayList<>();
    }

    public boolean park(Car car) {
        if (this.isFull()) return false;

        this.lot.add(car);

        return true;
    }

    public boolean isFull() {
        return lot.size() == totalSlots;
    }
}

