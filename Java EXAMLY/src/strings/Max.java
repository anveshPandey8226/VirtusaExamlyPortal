package strings;

//You are using Java

import java.util.*;

class Max{
 public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     s.nextLine();
     String input = s.nextLine();
     List<Integer> costs = new ArrayList<>();
     String[] costStrings = input.split(" ");
     
     for(String costString : costStrings){
         try {
             int cost = Integer.parseInt(costString);
             costs.add(cost);
         } catch (NumberFormatException nfe) {
           nfe.printStackTrace();
         }
         
     }
     
     
     Collections.sort(costs);
     int t = n - 1;
     System.out.println(costs.indexOf(-1));
     
     }
 }
