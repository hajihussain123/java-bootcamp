package com.tw.bootcamp.problem5.domain;

public class Ball {

    private final Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                '}';
    }
}
