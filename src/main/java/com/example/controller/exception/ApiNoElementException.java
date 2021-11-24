package com.example.controller.exception;

import java.util.NoSuchElementException;

public class ApiNoElementException extends NoSuchElementException {
    public ApiNoElementException(String s) {
        super(s);
    }

    public ApiNoElementException() {
    }

    public ApiNoElementException(String s, Throwable cause) {
        super(s, cause);
    }
}
