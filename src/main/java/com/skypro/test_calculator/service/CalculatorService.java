package com.skypro.test_calculator.service;

import com.skypro.test_calculator.exception.CannotBeDividedByZeroException;
import com.skypro.test_calculator.exception.ThereIsNoParameterException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public String greeting (){
       return "Добро пожаловать в калькулятор";
    }

    public Integer addition (Integer num1, Integer num2) throws ThereIsNoParameterException {
        if (num1 == null || num2 == null) {
            throw new ThereIsNoParameterException ("Введите параметры");
        }
        int result;
        return result = num1 + num2;
    }
    public Integer subtraction (Integer num1, Integer num2) throws ThereIsNoParameterException {
        if (num1 == null || num2 == null) {
            throw new ThereIsNoParameterException( "Введите параметры");
        }
        int result;
        return result = num1 - num2;
    }
    public Integer multiplication (Integer num1, Integer num2) throws ThereIsNoParameterException {
        if (num1 == null || num2 == null) {
            throw new ThereIsNoParameterException ("Введите параметры");
        }
        int result;
        return result  = num1 * num2;
    }

    public double division (Integer num1, Integer num2) throws ThereIsNoParameterException, CannotBeDividedByZeroException {
        if (num1 == null || num2 == null) {
            throw new ThereIsNoParameterException("Введите параметры");
        }
        if (num2 == 0) {
            throw new CannotBeDividedByZeroException ("На ноль делить нельзя!");
        }
        int result;
        return result = num1 / num2;
    }


}
