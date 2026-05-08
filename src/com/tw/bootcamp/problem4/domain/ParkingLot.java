package com.tw.bootcamp.problem4.domain;

import java.util.ArrayList;

public class ParkingLot {

    private final ArrayList<Car> lot;

    public ParkingLot() {
        this.lot = new ArrayList<>();
    }

    public Notification park(Car car) {
        this.lot.add(car);
        return new Notification("Car parked successfully");
    }
}

