package com.tw.bootcamp.problem3.domain;

public class InvalidUnitCreationException extends RuntimeException {
    private final String message;

    public InvalidUnitCreationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
