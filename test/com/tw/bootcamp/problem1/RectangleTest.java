package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void shouldReturn10For2And5() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(10, rectangle.area());
    }

    @Test
    void shouldReturn0ForLength0() {
        Rectangle rectangle = new Rectangle(0, 5000);
        assertEquals(0, rectangle.area());
    }
}