package com.tw.bootcamp.problem2.domain;

public class Coin {

    public double chanceOfTails(int timesToFlip) {
        double tailCount = 0;
        for (int flipCounter = 0; flipCounter < timesToFlip; flipCounter++) {
            if (this.flip().equals(CoinFace.TAILS)) {
                tailCount++;
            }
        }
        return (tailCount / timesToFlip) * 100;
    }

    public CoinFace flip() {
        return Math.random() < 0.5 ? CoinFace.TAILS : CoinFace.HEADS;
    }

    public double chanceOfNotGettingTails(int timesToFlip) {
        return 100 - this.chanceOfTails(timesToFlip);
    }
}

