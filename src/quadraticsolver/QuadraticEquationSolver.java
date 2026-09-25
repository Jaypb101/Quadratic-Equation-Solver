//
// Name:    Briones, Jayden
// Project: 1
// Due:     9/19/24
// Course:  cs-1400-05-f24
//
// Description:
//           Program to solve quadratic functions
//

package quadraticsolver;

import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver by J.Briones");
        System.out.println();

        System.out.print("Enter coefficient a? ");
        double coefficientA = sc.nextDouble();

        System.out.print("Enter coefficient b? ");
        double coefficientB = sc.nextDouble();

        System.out.print("Enter coefficient c? ");
        double coefficientC = sc.nextDouble();

        double discriminant = (coefficientB * coefficientB)
                - (4 * coefficientA * coefficientC);

        double squareRoot = Math.sqrt(discriminant);

        double rootOne = (-coefficientB + squareRoot)
                / (2 * coefficientA);

        double rootTwo = (-coefficientB - squareRoot)
                / (2 * coefficientA);

        System.out.println();
        System.out.println("The solutions:");
        System.out.println("x1 = " + rootOne);
        System.out.println("x2 = " + rootTwo);

        sc.close();
    }
}