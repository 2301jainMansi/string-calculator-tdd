package com.incubyte.tdd.calculator;

public class StringCalculator {
	public int add(String numbers) {
	    if (numbers.isEmpty()) return 0;
	    
	    if (numbers.startsWith("//")) {
	        String delimiter = numbers.substring(2, 3);
	        numbers = numbers.substring(4).replace(delimiter, ",");
	    }
	    String[] nums = numbers.split(",");
	    int sum = 0;
	    for (String num : nums) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}}
