package com.tw.bootcamp.problem4.domain;

import java.util.ArrayList;

public class ParkingLot {

    private final ArrayList<Car> lot;
    private final int totalSlots;

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.lot = new ArrayList<>();
    }

    public Notification park(Car car) {
        if(this.isFull()){
            return new Notification("ParkingLot is full");
        }

        this.lot.add(car);

        return new Notification("Car parked successfully");
    }

    public boolean isFull() {
        return lot.size() == totalSlots;
    }
}

