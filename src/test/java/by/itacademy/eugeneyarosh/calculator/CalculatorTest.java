package by.itacademy.eugeneyarosh.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdditionPositiveNumbers() {
        assertEquals(10, calculator.add(2, 8), "Сумма должна быть равна 10");
    }

    @Test
    void testAdditionPositiveAndZeroNumbers() {
        assertEquals(14, calculator.add(14, 0), "Сумма должна быть равна 14");
    }

    @Test
    void testAdditionPositiveAndNegativeNumbers() {
        assertEquals(100, calculator.add(180, -80), "Сумма должна быть равна 100");
    }

    @Test
    void testAdditionNegativeNumbers() {
        assertEquals(-5, calculator.add(0, -5), "Сумма должна быть равна -5");
    }

    @Test
    void testAdditionNegativeAndZeroNumbers() {
        assertEquals(-10, calculator.add(-10, 0), "Сумма должна быть равна -10");
    }

    @Test
    void testAdditionZeroNumbers() {
        assertEquals(0, calculator.add(0, 0), "Сумма должна быть равна 0");
    }

    @Test
    void testAdditionMaxAndMinIntegerValues() {
        assertEquals(-1, calculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE), "Сумма должна быть равна -1");
    }

}
