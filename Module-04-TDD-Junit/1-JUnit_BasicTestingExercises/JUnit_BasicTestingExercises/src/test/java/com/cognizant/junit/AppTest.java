package com.cognizant.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
    }

    @Test
    void testAddition() {

        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {

        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }

    @Test
    void testDivisionException() {

        // Arrange + Act + Assert
        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }
}