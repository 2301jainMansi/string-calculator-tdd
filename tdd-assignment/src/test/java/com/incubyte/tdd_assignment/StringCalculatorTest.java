package com.incubyte.tdd_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.incubyte.tdd.calculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	void emptyStringReturnsZero() {
	    assertEquals(0, new StringCalculator().add(""));
	}

	@Test
	void singleNumberReturnsItself() {
	    assertEquals(5, new StringCalculator().add("5"));
	}

	@Test
	void twoNumbersCommaSeparatedReturnsSum() {
	    assertEquals(3, new StringCalculator().add("1,2"));
	}

	@Test
	void multipleNumbersCommaSeparatedReturnsSum() {
	    assertEquals(10, new StringCalculator().add("1,2,3,4"));
	}

	@Test
	void newlinesBetweenNumbersAreValid() {
	    assertEquals(6, new StringCalculator().add("1\n2,3"));
	}

	@Test
	void customDelimiterReturnsSum() {
	    assertEquals(3, new StringCalculator().add("//;\n1;2"));
	}

	@Test
	void negativeNumbersThrowException() {
	    Exception ex = assertThrows(IllegalArgumentException.class,
	        () -> new StringCalculator().add("1,-2,3,-4"));
	    assertEquals("Negative numbers not allowed: -2, -4", ex.getMessage());
	}
}
