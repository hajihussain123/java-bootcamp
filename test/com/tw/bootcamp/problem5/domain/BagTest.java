package com.tw.bootcamp.problem5.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddBall() {
        Bag bag = new Bag();
        Ball ball = new Ball();
        assertTrue(bag.add(ball));
    }

    @Test
    void shouldNotAddTheBallIfThereIsNoSpace() {
        Bag bag = new Bag();
        for (int ballCount = 0; ballCount < 12; ballCount++) {
            Ball ball = new Ball();
            assertTrue(bag.add(ball));
        }
        assertFalse(bag.add(new Ball()));
    }
}