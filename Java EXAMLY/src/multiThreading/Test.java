// You are using Java
package multiThreading;

import java.util.*;

class Test{
    public void run(){}
    
    
    public static void main(String[] args){
    
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        
        for(int i = 0 ; i < n ; i++){
            String hall = s.nextLine();
            int cost = s.nextInt();
            int hallC = s.nextInt();
            int seatsB = s.nextInt();
            s.nextLine();
            if(cost > seatsB * 100){
                System.out.println("Loss");
            }
            else{
                System.out.println("Profit");
            }
        }
    }
}