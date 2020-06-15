package Lets_review;

/*
 * Task Given a string,S , of length N that is indexed from 0 to N-1,
 *  print its even-indexed and odd-indexed characters as 2 space-separated strings on 
 *  a single line (see the Sample below for more detail).
 *  Note:0  is considered to be an even index.
 * 
 * Sample Input
 * 2
 * Hacker
 * Rank
 * 
 * Sample Output
 * Hce akr
 * Rn ak
 * 
 */

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        for(int i = 0; i < count; i++){
            char[] inputString = scan.next().toCharArray();
            
            // Print even chars
            for(int j = 0; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.print(" ");
            
            // Print odd chars
            for(int j = 1; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.println();
        }
        scan.close();

    }
}
