package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void shouldReturnArea10For2And5() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(10, rectangle.area());
    }

    @Test
    void shouldReturnArea0ForLength0() {
        Rectangle rectangle = new Rectangle(0, 5000);
        assertEquals(0, rectangle.area());
    }

    @Test
    void shouldReturnPerimeter18For5And4() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.perimeter());
    }
}