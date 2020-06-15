package Dictonaries_andMaps;

/*
 * Sample Input
 * 3
 * sam 99912222
 * tom 11122222
 * harry 12299933
 * sam
 * edward
 * harry
 * 
 * Sample Output
 * sam=99912222
 * Not found
 * harry=12299933
 * 
 */

//Complete this code or write your own from scratch
import java.util.*;

class Solution{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
    HashMap<String,Integer> myMap = new HashMap<String,Integer>();
      int n = in.nextInt();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          myMap.put(name,phone);

      }
      while(in.hasNext()){
          String s = in.next();
          // Write code here
          if(myMap.get(s)==null){
                System.out.println("Not found"); 
          }else{
              System.out.println(s+"="+myMap.get(s)); 
          }
             
        }
      in.close();
  }
}
