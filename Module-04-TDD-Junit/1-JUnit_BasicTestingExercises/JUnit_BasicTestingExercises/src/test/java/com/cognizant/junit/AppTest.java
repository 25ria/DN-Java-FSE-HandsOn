package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void testTrue() {
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    void testFalse() {
        assertFalse(calculator.add(2, 2) == 5);
    }

    @Test
    void testNotEquals() {
        assertNotEquals(10, calculator.add(2, 3));
    }

    @Test
    void testNotNull() {
        assertNotNull(calculator.getMessage());
    }

    @Test
    void testNull() {
        assertNull(calculator.getNullValue());
    }

    @Test
    void testException() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0));
    }
}