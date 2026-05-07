package com.tw.bootcamp.problem1;

import com.tw.bootcamp.problem1.domain.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldReturnArea9ForSide3() {
        Square square = new Square(3);
        assertEquals(9, square.area());
    }

    @Test
    void shouldReturnArea0ForSide0() {
        Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void shouldReturnPerimeter16ForSide4() {
        Square square = new Square(4);
        assertEquals(16, square.perimeter());
    }
}