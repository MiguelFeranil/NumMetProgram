package MathInterpolation;

import java.util.Scanner;

public class LagrangeLogic {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the number of data points: ");
        int n = scanner.nextInt();

        // Create arrays to store the x and f(x) values
        double[] x = new double[n];
        double[] fx = new double[n];

        System.out.println("Enter the x and f(x) values:");
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = scanner.nextDouble();
            System.out.print("f(x[" + i + "]) = ");
            fx[i] = scanner.nextDouble();
        }

        System.out.print("\nEnter the value of x1: ");
        double x1 = scanner.nextDouble();

        // Call the lagrangeInterpolation method with the x, fx and x1 values
        double result = lagrangeInterpolation(x, fx, x1);

        // Display the result of the Lagrange interpolation
        System.out.println("\nResult after Lagrange interpolation f(" + x1 + ") = " + result);
    }

    // Method to calculate the Lagrange interpolation
    public static double lagrangeInterpolation(double[] x, double[] fx, double x1) {
        double res = 0;
        for (int i = 0; i < x.length; i++) {
            double tempProd = 1;
            for (int j = 0; j < x.length; j++) {
                if (i != j) {
                    // Calculate the product of the terms
                    tempProd *= (x1 - x[j]) / (x[i] - x[j]);
                }
            }
            // Multiply the product with the f(x) value
            tempProd *= fx[i];
            res += tempProd;
        }
        return res;
    }
}