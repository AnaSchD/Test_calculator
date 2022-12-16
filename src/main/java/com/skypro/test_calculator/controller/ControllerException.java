package com.skypro.test_calculator.controller;

import com.skypro.test_calculator.exception.CannotBeDividedByZeroException;
import com.skypro.test_calculator.exception.ThereIsNoParameterException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerException {

    @ExceptionHandler(ThereIsNoParameterException.class)
    public ResponseEntity<String> thereIsNoParameterException(ThereIsNoParameterException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CannotBeDividedByZeroException.class)
    public ResponseEntity<String> cannotBeDividedByZero(CannotBeDividedByZeroException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
