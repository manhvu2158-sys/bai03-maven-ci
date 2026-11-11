package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Executing add operation: {} + {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        logger.info("Executing divide operation: {} / {}", a, b);
        if (b == 0) {
            logger.error("Division by zero error!");
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        logger.info("Starting Calculator application...");
        Calculator calc = new Calculator();
        System.out.println("Result: " + calc.add(10, 20));
    }
}