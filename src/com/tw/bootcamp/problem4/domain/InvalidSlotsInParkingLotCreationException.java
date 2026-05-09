package com.tw.bootcamp.problem4.domain;

public class InvalidSlotsInParkingLotCreationException extends RuntimeException {
    private final String message;

    public InvalidSlotsInParkingLotCreationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
