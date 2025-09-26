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
	    
	    
	    StringBuilder negatives = new StringBuilder();
	    for (String num : nums) {
	        int n = Integer.parseInt(num);
	        if (n < 0) {
	            if (negatives.length() > 0) negatives.append(", ");
	            negatives.append(n);
	        } else {
	            sum += n;
	        }
	    }
	    if (negatives.length() > 0) {
	        throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
	    }
	    return sum;
	}
  }
