package com.tw.bootcamp.problem2.domain;

public class Coin {
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";

    public double chanceOfTails(int noOfTimes) {
        double tailCount = 0;
        for (int flipCounter = 0; flipCounter < noOfTimes; flipCounter++) {
            if(this.flip().equals(TAILS)) {
                tailCount++;
            }
        }
        return tailCount;
    }

    public String flip() {
        return Math.random() < 0.5 ? TAILS : HEADS;
    }
}

