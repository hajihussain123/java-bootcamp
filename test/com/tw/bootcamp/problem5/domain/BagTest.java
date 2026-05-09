package com.tw.bootcamp.problem5.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void shouldNotAddRedBallIfGreenBallIsLessThanOrEqualToItsHalfInTheBag() {
        Bag bag = new Bag();
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));
        assertFalse(bag.add(new Ball(Color.RED)));
    }

    @Test
    void shouldNotAddTheYellowBallIfYellowBallsAreMoreThanEqualTo40PercentOfTotal() {
        Bag bag = new Bag();
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.YELLOW));
        bag.add(new Ball(Color.YELLOW));
        assertFalse(bag.add(new Ball(Color.YELLOW)));
    }

    @Test
    void shouldDisplaySummaryOfTheBag() {
        Bag bag = new Bag();
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.RED));
        bag.add(new Ball(Color.YELLOW));
        bag.add(new Ball(Color.YELLOW));
        assertEquals("Summary:\n\nBlue   : 0\nGreen  : 1\nRed    : 2\nYellow : 2\n\nTotal : 5", bag.getSummary());
    }
}