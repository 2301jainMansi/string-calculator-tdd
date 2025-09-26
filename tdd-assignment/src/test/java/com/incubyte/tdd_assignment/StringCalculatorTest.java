package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	void newlinesBetweenNumbersAreValid() {
	    StringCalculator calc = new StringCalculator();
	    assertEquals(6, calc.add("1\n2,3"), "Newline should be treated as delimiter");
	}
}
