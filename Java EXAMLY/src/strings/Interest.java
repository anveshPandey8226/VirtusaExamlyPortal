package strings;

//You are using Java

import java.util.*;

class Interest{
 
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 
 public static void main(String[] args){
     
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     
     for(int i = 0; i<n; i++){
         String acc= s.next();
         int balance = s.nextInt();
         String name = s.next();
         
         if(balance >= 10000){
             System.out.println(Double.valueOf((balance * 8)/100.0));
         }
         else{
             System.out.println(Double.valueOf((balance * 5)/100.0));
         }
     }
 }
}