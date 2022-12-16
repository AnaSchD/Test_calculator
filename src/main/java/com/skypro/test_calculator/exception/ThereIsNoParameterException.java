package com.skypro.test_calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
        (code = HttpStatus.BAD_REQUEST, reason = "Введите параметры")
public class ThereIsNoParameterException extends Throwable {

    public ThereIsNoParameterException(String message) {
        super(message);
    }
}
