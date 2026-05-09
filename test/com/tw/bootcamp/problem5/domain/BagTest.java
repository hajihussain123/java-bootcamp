package com.tw.bootcamp.problem5.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BagTest {
    @Test
    void shouldAddBall() {
        Bag bag = new Bag();
        Ball ball = new Ball(Color.BLUE);
        assertTrue(bag.add(ball));
    }

    @Test
    void shouldNotAddTheBallIfThereIsNoSpace() {
        Bag bag = new Bag();
        for (int ballCount = 0; ballCount < 12; ballCount++) {
            Ball ball = new Ball(Color.BLUE);
            assertTrue(bag.add(ball));
        }
        assertFalse(bag.add(new Ball(Color.GREEN)));
    }

    @Test
    void shouldNotAddTheGreenBallIfThereAreAlreadyThreeGreenBalls() {
        Bag bag = new Bag();
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.GREEN));
        assertFalse(bag.add(new Ball(Color.GREEN)));
    }
}