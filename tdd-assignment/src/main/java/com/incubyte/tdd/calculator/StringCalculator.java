package com.incubyte.tdd.calculator;

public class StringCalculator {
	 public int add(String numbers) {
	        if (numbers == null || numbers.isEmpty()) {
	            return 0;
	        }

	        String delimiter = ",";
	        // Check for custom delimiter
	        if (numbers.startsWith("//")) {
	            delimiter = numbers.substring(2, 3);
	            numbers = numbers.substring(4); // Skip delimiter declaration
	        }

	        // Replace newlines with delimiter
	        numbers = numbers.replace("\n", delimiter);

	        String[] nums = numbers.split(delimiter);
	        int sum = 0;
	        StringBuilder negatives = new StringBuilder();

	        for (String num : nums) {
	            if (num.isEmpty()) continue;
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
