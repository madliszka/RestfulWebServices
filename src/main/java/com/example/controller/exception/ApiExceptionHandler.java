package com.example.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {

        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, BAD_REQUEST);
    }

    @ExceptionHandler(value = {ApiNoElementException.class})
    public ResponseEntity<Object> handleApiNoElementException(ApiNoElementException e) {


        ApiException apiException = new ApiException("Nothing to delete!", NOT_FOUND);

        return new ResponseEntity<>(apiException, NOT_FOUND);
    }
}
