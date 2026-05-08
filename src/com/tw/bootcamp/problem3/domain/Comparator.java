package com.tw.bootcamp.problem3.domain;

public class Comparator {

    public boolean isEquals(Inch length1, Feet length2) {
        return length1.equals(length2.convertToInch());
    }

    public boolean isEquals(Feet length1, Inch length2) {
        return length1.equals(length2.convertToFeet());
    }
}
