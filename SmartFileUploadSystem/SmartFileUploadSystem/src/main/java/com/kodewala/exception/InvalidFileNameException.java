package com.kodewala.exception;

public class InvalidFileNameException extends RuntimeException {
    public InvalidFileNameException(String message) {
        super(message);
    }
}
