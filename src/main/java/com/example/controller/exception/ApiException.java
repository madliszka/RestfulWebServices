package com.example.controller.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private final String message;
    private  Throwable throwable;
    private  HttpStatus httpStatus;
    private  ZonedDateTime timestamp;

    public ApiException(String message,
                        Throwable throwable,
                        HttpStatus httpStatus,
                        ZonedDateTime timestamp) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public ApiException(String message) {
        this.message = message;
    }
    public ApiException(String message,HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
