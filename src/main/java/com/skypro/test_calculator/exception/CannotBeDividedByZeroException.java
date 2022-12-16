package com.skypro.test_calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
        (code = HttpStatus.BAD_REQUEST, reason = "На ноль делить нельзя!")
public class CannotBeDividedByZeroException extends Throwable {

    public CannotBeDividedByZeroException (String message) {
        super(message);
    }
}
