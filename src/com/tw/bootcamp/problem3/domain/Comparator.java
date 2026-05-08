package com.tw.bootcamp.problem3.domain;

public class Comparator {

    public <T extends Length> boolean compareLengths(T length1, T length2) {
        return length1.convertToBase().equals(length2.convertToBase());
    }

    public <T extends Volume> boolean compareVolumes(T volume1, T volume2) {
        return volume1.convertToBase().equals(volume2.convertToBase());
    }
}
