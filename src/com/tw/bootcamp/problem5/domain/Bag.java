package com.tw.bootcamp.problem5.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        if (this.occupiedSlots == totalSlots) return false;

        Color color = ball.getColor();
        ArrayList<Ball> pocket = getPocket(color);
        if (canAddBall(color, pocket)) return false;

        pocket.add(ball);
        this.occupiedSlots++;

        return true;
    }

    private boolean canAddBall(Color color, ArrayList<Ball> pocket) {
        return switch (color) {
            case GREEN -> pocket.size() == 3;
            case YELLOW -> ((double) pocket.size() / occupiedSlots) * 100 >= 40.0;
            case RED -> getPocket(Color.GREEN).size() * 2 <= pocket.size();
            default -> false;
        };
    }

    private ArrayList<Ball> getPocket(Color color) {
        if (!pockets.containsKey(color)) pockets.put(color, new ArrayList<>());

        return pockets.get(color);
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
