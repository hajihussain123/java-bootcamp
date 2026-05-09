package com.tw.bootcamp.problem5.domain;

import java.util.ArrayList;

public class Bag {
    private final ArrayList<Ball> slots;
    private final int totalSlots;

    public Bag() {
        this.slots = new ArrayList<>();
        this.totalSlots = 12;
    }

    public boolean add(Ball ball) {
        if (this.slots.size() < this.totalSlots) {
            this.slots.add(ball);
            return true;
        }
        return false;
    }
}
