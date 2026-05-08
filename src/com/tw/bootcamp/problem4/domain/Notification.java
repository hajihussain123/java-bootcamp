package com.tw.bootcamp.problem4.domain;

import java.util.Objects;

public class Notification {
    private final String message;

    public Notification(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Notification that)) return false;
        return Objects.equals(message, that.message);
    }
}
