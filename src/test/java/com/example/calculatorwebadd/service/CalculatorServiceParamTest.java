package com.example.calculatorwebadd.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculatorwebadd.CalculatorTestConstants.*;
import static com.example.calculatorwebadd.CalculatorTestConstants.ONE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParamTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @MethodSource("provideParams")
    @ParameterizedTest
    void sum(int num1, int num2) {

        assertEquals(num1 + num2, service.sum(num1, num2));

    }
    @MethodSource("provideParams")
    @ParameterizedTest
    void minus(int num1, int num2) {

        assertEquals(num1 - num2, service.minus(num1, num2));

    }
    @MethodSource("provideParams")
    @ParameterizedTest
    void multiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));

    }
    @MethodSource("provideParams")
    @ParameterizedTest
    void divide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));

    }

    private  static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(THREE, TWO),
                Arguments.of(TWO, ONE),
                Arguments.of(THREE, ONE),
                Arguments.of(ONE, ONE),
                Arguments.of(THREE, THREE)
        );
    }
}
