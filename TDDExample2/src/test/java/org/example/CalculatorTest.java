/*
 * Student number: B201202006
 * First name and last name: Sinem Taşdemir
 * Course name and homework Info: SWE 202 Software Verification and Validation, Homework 1
 * GitHub repository address: https://github.com/sinemtasdemir19/SWE202-TDDExample2-ParameterizedTest.git
 */
package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 2.5, 5",
            "10, 2.5, 4",
            "12.5, 5, 2.5"
    })
    void testDivision(float dividend, float divisor, float expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }
    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}