package Data_type;

import java.io.*;
import java.util.*;
import java.text.*;

/*
 * Sample Input
 * 12
 * 4.0
 * is the best place to learn and practice coding!
 * 
 * Sample Output
 * 16
 * 8.0
 * HackerRank is the best place to learn and practice coding!
 * 
 */


public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        
 /* Declare second integer, double, and String variables. */
      int one;
      float two;
      String string;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        one = scan.nextInt();
        two = scan.nextFloat();
    
        /* Print the sum of both integer variables on a new line. */
         System.out.println(one+i);
        
    
        /* Print the sum of the double variables on a new line. */
       
        System.out.println(two+d);
       
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
             System.out.println(s +"is the best place to learn and practice coding!");

        scan.close();
    }
}