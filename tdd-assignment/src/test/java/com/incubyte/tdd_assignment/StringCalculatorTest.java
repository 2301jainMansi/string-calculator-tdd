package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	void singleNumberReturnsItself() {
	    StringCalculator calc = new StringCalculator();
	    assertEquals(5, calc.add("5"), "Single number should return itself");
	}
}
