package Operators;

/*
 * Sample Input
 * 12.00
 * 20
 * 8
 * 
 * Sample Output
 * 15
 * 
 */


import java.util.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

    double tip,tax;
    double totalSum;
     tip = meal_cost*((double)tip_percent)/100;
     tax = meal_cost*((double)tax_percent)/100;
        totalSum = tip+tax+ meal_cost;
        System.out.print((int)Math.round(totalSum));

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
