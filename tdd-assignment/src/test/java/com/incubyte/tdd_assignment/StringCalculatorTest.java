package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	    @Test
	    void emptyStringReturnsZero() {
	        StringCalculator calc = new StringCalculator();
	        assertEquals(0, calc.add(""), "Empty string should return 0");
	    }
}
