package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	void negativeNumbersThrowException() {
	    StringCalculator calc = new StringCalculator();
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        calc.add("1,-2,3,-4");
	    });
	    assertEquals("Negative numbers not allowed: -2, -4", exception.getMessage());
	}
}
