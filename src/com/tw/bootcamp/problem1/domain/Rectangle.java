package com.tw.bootcamp.problem1.domain;

public class Rectangle implements Quadrilateral {

    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side,side);
    }

    public static Rectangle createRectangle(double length, double breadth) {
        return new Rectangle(length, breadth);
    }

    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
