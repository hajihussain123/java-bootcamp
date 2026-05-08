package com.tw.bootcamp.problem3.domain;

public class Comparator {

    public <T1 extends Unit,T2 extends Unit> boolean isEquals(T1 length1, T2 length2) {
        return length1.convertToBase().equals(length2.convertToBase());
    }
}
