package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	void twoNumbersCommaSeparatedReturnsSum() {
	    StringCalculator calc = new StringCalculator();
	    assertEquals(3, calc.add("1,2"), "Two numbers should return their sum");
	}
}
