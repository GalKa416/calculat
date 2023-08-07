package com.example.calculatorwebadd.service;

import com.example.calculatorwebadd.exeption.ZeroDivideExeption;
import org.assertj.core.data.TemporalUnitWithinOffset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.calculatorwebadd.CalculatorTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @Test
    void sum() {

        assertEquals(ONE + TWO, service.sum(ONE, TWO));
        assertEquals(ONE + ONE, service.sum(ONE, ONE));
    }

    @Test
    void minus() {

        assertEquals(THREE - TWO, service.minus(THREE, TWO));
        assertEquals(TWO - ONE, service.minus(TWO, ONE));
    }

    @Test
    void multiply() {
        assertEquals(THREE * TWO, service.multiply(THREE, TWO));
        assertEquals(TWO * ONE, service.multiply(TWO, ONE));
    }

    @Test
    void divide() {
        assertEquals(THREE / ONE, service.divide(THREE, ONE));
        assertEquals(ONE / ONE, service.divide(ONE, ONE));
    }

    @Test
    void shouldThrowZeroDivideExeption() {
        assertThrows(ZeroDivideExeption.class, () -> service.divide(THREE, ZERO));

    }
}