package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	void customDelimiterReturnsSum() {
	    StringCalculator calc = new StringCalculator();
	    assertEquals(3, calc.add("//;\n1;2"), "Custom delimiter should work");
	}
}
