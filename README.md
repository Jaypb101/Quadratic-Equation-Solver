# Quadratic Equation Solver

A Java program that calculates the two solutions of a quadratic equation using the quadratic formula.

## Description

This program asks the user to enter the three coefficients of a quadratic equation:

* `a`
* `b`
* `c`

It then uses the quadratic formula to calculate and display both solutions.

## Example

```text
Quadratic Equation Solver by J.Briones

Enter coefficient a? 1
Enter coefficient b? 5
Enter coefficient c? 6

The solutions:
x1 = -2.0
x2 = -3.0
```

## Project Structure

```text
src/
└── quadraticsolver/
    └── QuadraticEquationSolver.java
```

## Concepts Used

* Java variables and data types
* User input with `Scanner`
* Arithmetic expressions
* `Math.sqrt()`
* Console input and output
* Quadratic formula

## Requirements

* Java Development Kit (JDK)

## Running the Program

Compile the program:

```text
javac -d bin src/quadraticsolver/QuadraticEquationSolver.java
```

Run the program:

```text
java -cp bin quadraticsolver.QuadraticEquationSolver
```

## Author

Jayden Briones

## Course

CS 1400 - Project 1
