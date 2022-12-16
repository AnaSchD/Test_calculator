package com.skypro.test_calculator;


import com.skypro.test_calculator.exception.CannotBeDividedByZeroException;
import com.skypro.test_calculator.exception.ThereIsNoParameterException;
import com.skypro.test_calculator.service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {

    private static final Integer num1 = 5;
    private static final Integer num2 = 5;
    private CalculatorService calculatorService;


    @ParameterizedTest
    @MethodSource ("specifyTheParametersForTests") // аннотация для методов для параметризованных тестов
    public void addition (Integer num1, Integer num2) throws ThereIsNoParameterException {
        calculatorService = new CalculatorService(); //создаю экземпляр класса
        assertEquals(calculatorService.addition(num1, num2), num1 + num2); //сравниваю
    }

    @ParameterizedTest
    @MethodSource ("specifyTheParametersForTests")
    public void subtraction(Integer num1, Integer num2) throws ThereIsNoParameterException{
        calculatorService = new CalculatorService(); //создаю экземпляр класса
        assertEquals(calculatorService.subtraction(num1, num2),num1 - num2);
    }

    @ParameterizedTest
    @MethodSource ("specifyTheParametersForTests")
    public void multiplication (Integer num1, Integer num2) throws ThereIsNoParameterException{
        calculatorService = new CalculatorService(); //создаю экземпляр класса
        assertEquals(calculatorService.multiplication(num1, num2),num1 * num2);
    }

    @ParameterizedTest
    @MethodSource ("specifyTheParametersForTests")
    public void division (Integer num1, Integer num2) throws ThereIsNoParameterException, CannotBeDividedByZeroException {
        calculatorService = new CalculatorService(); //создаю экземпляр класса
        assertEquals(calculatorService.division( num1, num2),  (double)num1 /  num2);
    }

    public static Stream<Arguments> specifyTheParametersForTests() {
        return Stream.of(Arguments.of(num1, num2));
    }
}
