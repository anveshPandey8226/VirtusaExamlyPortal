package strings;

import java.util.Scanner;

public class AppendString {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder input1 = new StringBuilder();
        
  
        // append a string into StringBuilder input1
        String input2 = sc.nextLine()+ " "; 
        input1.append(input2);
        
        String input3 = sc.nextLine(); 
        input1.append(input3);
  
        
        System.out.println(input1);
    }

}
