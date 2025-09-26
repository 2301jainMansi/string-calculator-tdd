String Calculator TDD Assignment
Overview

This repository contains my solution for the String Calculator TDD assignment as part of the application process for the Software Craftsperson - Java/Angular [3+] role at Incubyte.

The goal of this assignment is to implement a simple StringCalculator class that adds numbers provided in a string format, following Test-Driven Development (TDD) principles.

Features Implemented

Return 0 for empty strings

Return the value of a single number

Sum two or more comma-separated numbers

Handle multiple numbers

Support newline (\n) as a delimiter

Support custom delimiters in the format //<delimiter>\n<numbers>

Throw an exception for negative numbers, listing all negatives

How to Run

Clone the repository:

git clone <https://github.com/2301jainMansi/string-calculator-tdd.git>

Navigate to the project directory:

cd string-calculator

Run the tests using your preferred IDE or command line:

mvn test   # if using Maven

or

./gradlew test   # if using Gradle

TDD Approach

This project demonstrates Test-Driven Development (TDD) with the following workflow:

Write a failing test – define the expected behavior.

Write minimal implementation – make the test pass.

Refactor – improve code quality while keeping tests green.

Commit frequently – each commit shows the evolution of the code and the TDD steps.

Commit Highlights

Add test for empty string input → First failing test

Implement add() to return 0 for empty string → Minimal implementation

Add test for single number input → Next TDD step

Handle single number input in add() → Implementation

Add test for two comma-separated numbers → And so on…

All commits demonstrate the progression of the TDD workflow for this assignment.

Notes

The solution is implemented in Java using JUnit 5 for testing.

The project strictly follows TDD principles.

This repository is public for review by Incubyte.
