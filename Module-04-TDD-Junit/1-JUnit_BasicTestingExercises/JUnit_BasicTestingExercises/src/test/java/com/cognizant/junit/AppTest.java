package com.cognizant.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("========== Starting Test Suite ==========");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("========== Test Suite Finished ==========");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Creating Calculator");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning Resources");
    }

    @Test
    void testAddition() {

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {

        int result = calculator.subtract(10, 4);

        assertEquals(6, result);
    }

    @Test
    void testException() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
    }
}