// Objective
// In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video!

// Task
// Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

// Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

// Input Format
// There are  lines of numeric input:
// The first line has a double,  (the cost of the meal before tax and tip).
// The second line has an integer,  (the percentage of  being added as tip).
// The third line has an integer,  (the percentage of  being added as tax).

// Output Format
// Print the total meal cost, where  is the rounded integer result of the entire bill ( with added tax and tip).

// Sample Input
// 12.00
// 20
// 8

// Sample Output
// 15


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double totalCost;
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;

        totalCost = meal_cost + tip + tax;
        System.out.println(Math.round(totalCost));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
