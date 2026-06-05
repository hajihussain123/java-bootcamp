package com.tw.bootcamp.problem5.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bag {
    private final Map<Color, ArrayList<Ball>> pockets;
    private final int totalSlots;
    private final ArrayList<Rule> ruleBook;
    private int occupiedSlots;

    public Bag(ArrayList<Rule> ruleBook) {
        this.ruleBook = ruleBook;
        this.pockets = new HashMap<>();
        this.totalSlots = 12;
        this.occupiedSlots = 0;
    }

    public Bag() {
        this.pockets = new HashMap<>();
        this.totalSlots = 12;
        this.occupiedSlots = 0;
        ruleBook = new ArrayList<>();
    }

    public boolean add(Ball ball) {
        if (this.occupiedSlots == totalSlots) return false;

        Color color = ball.getColor();
        ArrayList<Ball> pocket = getPocket(color);
        if (!canAddBall(color, pocket)) return false;

        pocket.add(ball);
        this.occupiedSlots++;

        return true;
    }

    private boolean canAddBall(Color color, ArrayList<Ball> pocket) {
        return switch (color) {
            case GREEN -> pocket.size() < 3;
            case YELLOW -> ((double) pocket.size() / occupiedSlots) * 100 < 40.0;
            case RED -> getPocket(Color.GREEN).size() * 2 > pocket.size();
            case BLUE -> true;
        };
    }

    private ArrayList<Ball> getPocket(Color color) {
        if (!pockets.containsKey(color)) pockets.put(color, new ArrayList<>());

        return pockets.get(color);
    }

    public String getSummary() {
        return "Summary:\n\n" +
                this.getPocketsSummary() +
                "\n\nTotal : " + occupiedSlots;
    }

    private String getPocketsSummary() {
        ArrayList<Ball> bluePocket = getPocket(Color.BLUE);
        ArrayList<Ball> redPocket = getPocket(Color.RED);
        ArrayList<Ball> greenPocket = getPocket(Color.GREEN);
        ArrayList<Ball> yellowPocket = getPocket(Color.YELLOW);

        return "Blue   : " + bluePocket.size() +
                "\nGreen  : " + greenPocket.size() +
                "\nRed    : " + redPocket.size() +
                "\nYellow : " + yellowPocket.size();
    }
}
