package com.skypro.test_calculator;

import com.skypro.test_calculator.exception.CannotBeDividedByZeroException;
import com.skypro.test_calculator.exception.ThereIsNoParameterException;
import com.skypro.test_calculator.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Integer num1 = 5;
    private Integer num2 = 5;

    private Integer num3 = 0;

    private final CalculatorService calculatorService = new CalculatorService();

    @BeforeEach
    public void setUp() throws ThereIsNoParameterException {
        if (num1 == null || num2 == null) {
            throw new ThereIsNoParameterException("Введите параметры");
        }
    }

    @Test
    public void addition () throws ThereIsNoParameterException {
        Integer expected = calculatorService.addition(num1, num2);
        Integer actual = num1 + num2;
        assertEquals(expected, actual);
    }

    @Test
    public void subtraction() throws ThereIsNoParameterException {
        Integer expected = calculatorService.subtraction(num1, num2);
        Integer actual = num1 - num2;
        assertEquals(expected,actual);
    }
    @Test
    public void multiplication () throws ThereIsNoParameterException{
        Integer expected = calculatorService.multiplication(num1, num2);
        Integer actual = num1 * num2;
        assertEquals(expected,actual);
    }
    @Test
    public void division () throws ThereIsNoParameterException, CannotBeDividedByZeroException {
        double expected = calculatorService.division(num1, num2);
        double actual = num1 / num2;
        assertEquals(expected,actual);
    }

    @Test
    public void divisionThrow() {
        assertThrows(CannotBeDividedByZeroException.class, () -> calculatorService.division(num1, num3));
    }

}
