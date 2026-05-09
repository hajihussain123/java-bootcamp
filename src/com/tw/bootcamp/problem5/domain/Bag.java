package com.tw.bootcamp.problem5.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bag {
    private final Map<Color, ArrayList<Ball>> pockets;
    private final int totalSlots;
    private int occupiedSlots;

    public Bag() {
        this.pockets = new HashMap<>();
        this.totalSlots = 12;
        this.occupiedSlots = 0;
    }

    public boolean add(Ball ball) {
        if(this.occupiedSlots == totalSlots) return false;

        Color color = ball.getColor();

        if(!pockets.containsKey(color)) {
            pockets.put(color, new ArrayList<>());
        }

        ArrayList<Ball> pocket = pockets.get(color);
        pocket.add(ball);

        this.occupiedSlots++;

        return true;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "pockets=" + pockets +
                ", totalSlots=" + totalSlots +
                ", occupiedSlots=" + occupiedSlots +
                '}';
    }
}
