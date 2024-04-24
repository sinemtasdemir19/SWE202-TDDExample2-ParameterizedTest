# SWE202-TDDExample2-ParameterizedTest

## Description
This repository contains a simple Java project developed for the SWE 202 Software Verification and Validation course's Homework 1. The project implements a basic calculator with a division operation and includes corresponding unit tests using JUnit 5.

## Project Structure
The project consists of three Java files organized into the `org.example` package:
1. `Calculator.java`: Contains the implementation of the calculator class with a static method for division.
2. `CalculatorTest.java`: Includes parameterized tests and a regular test for the division operation in the `Calculator` class using JUnit 5.
3. `Main.java`: Demonstrates the usage of the `Calculator` class's division method.

## Testing Approach
### Parameterized Tests
The `CalculatorTest` class includes parameterized tests for the `divide` method. The tests use different sets of input parameters to validate the correctness of the division operation.

### Regular Test
A regular test is included in the `CalculatorTest` class to ensure that the `divide` method throws an `IllegalArgumentException` when dividing by zero.

## Running the Tests
To run the tests, execute the test class `CalculatorTest.java`. Ensure that JUnit 5 is configured in your development environment.
