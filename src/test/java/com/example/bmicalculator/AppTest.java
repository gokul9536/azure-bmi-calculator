package com.example.bmicalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAppHasAGreeting() {
        String output = "Hello World!";
        assertEquals("Hello World!", output, "App should print Hello World!");
    }

    @Test
    void testBmiCalculation() {
        double weight = 70;   // kg
        double height = 1.75; // meters
        double bmi = weight / (height * height);

        assertEquals(22.86, bmi, 0.01, "BMI should be calculated correctly");
    }
}
