package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	void multipleNumbersCommaSeparatedReturnsSum() {
	    StringCalculator calc = new StringCalculator();
	    assertEquals(10, calc.add("1,2,3,4"), "Multiple numbers should return their sum");
	}
}
