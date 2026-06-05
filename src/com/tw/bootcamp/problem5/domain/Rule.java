package com.tw.bootcamp.problem5.domain;

import java.util.ArrayList;
import java.util.Map;

public interface Rule {
    boolean check(Map<Color, ArrayList<Ball>> pockets, Ball ball);
}
