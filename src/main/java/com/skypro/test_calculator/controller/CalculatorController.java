package com.skypro.test_calculator.controller;

import com.skypro.test_calculator.exception.CannotBeDividedByZeroException;
import com.skypro.test_calculator.exception.ThereIsNoParameterException;
import com.skypro.test_calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) throws ThereIsNoParameterException, CannotBeDividedByZeroException {
        this.calculatorService = calculatorService;
    }

    @GetMapping ("")
    public String calculator (){
        return calculatorService.greeting();
    }


    @GetMapping("/plus")
    public Integer plus (@RequestParam Integer num1, @RequestParam Integer num2) throws ThereIsNoParameterException {
        return this.calculatorService.addition (num1, num2);
    }

    @GetMapping("/minus")
    public Integer minus (@RequestParam Integer num1, @RequestParam Integer num2) throws ThereIsNoParameterException {
        return this.calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public Integer multiply (@RequestParam Integer num1, @RequestParam Integer num2) throws ThereIsNoParameterException {
       return this.calculatorService.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public double divide (@RequestParam Integer num1, @RequestParam Integer num2) throws CannotBeDividedByZeroException, ThereIsNoParameterException {
       return this.calculatorService.division(num1,num2);
    }
}
