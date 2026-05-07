package com.tw.bootcamp.problem2.domain;

public class InvalidProbabilityCreationException extends RuntimeException {
    private final String message;

    public InvalidProbabilityCreationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
