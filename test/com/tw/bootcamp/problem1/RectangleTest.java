package com.tw.bootcamp.problem1;

import com.tw.bootcamp.problem1.domain.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void shouldReturnArea10For2And5() {
        Rectangle rectangle = Rectangle.createRectangle(2, 5);
        assertEquals(10, rectangle.area());
    }

    @Test
    void shouldReturnArea0ForLength0() {
        Rectangle rectangle = Rectangle.createRectangle(0, 5000);
        assertEquals(0, rectangle.area());
    }

    @Test
    void shouldReturnPerimeter18For5And4() {
        Rectangle rectangle = Rectangle.createRectangle(4, 5);
        assertEquals(18, rectangle.perimeter());
    }

    @Test
    void shouldReturnArea9ForSide3() {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(9, square.area());
    }

    @Test
    void shouldReturnArea0ForSide0() {
        Rectangle square = Rectangle.createSquare(0);
        assertEquals(0, square.area());
    }

    @Test
    void shouldReturnPerimeter16ForSide4() {
        Rectangle square = Rectangle.createSquare(4);
        assertEquals(16, square.perimeter());
    }
}