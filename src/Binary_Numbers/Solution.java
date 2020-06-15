package Binary_Numbers;

/*
 * Sample Input 1
 * 5
 * 
 * Sample Output 1
 * 1
 * 
 * Sample Input 2
 * 13
 * 
 * Sample Output 2
 * 2
 * 
 */

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int remainder=0,i=0,t=0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            while(n > 0){
           
              remainder = n%2;
               n = n/2;
                if(remainder==1){
                    i++;
                    if(i>=t){
                        t=i;
                    }  
                } else{
                        i=0;
                    }

            }
          
         System.out.print(t);

        scanner.close();
    }
}

