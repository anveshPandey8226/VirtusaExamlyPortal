package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KingdomDivision {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 List<String> chola = new ArrayList<String>();
		 List<String> chera = new ArrayList<String>();  
		 List<String> pallava = new ArrayList<String>();  
		 List<String> pandya = new ArrayList<String>();  
		 List<String> renounce = new ArrayList<String>();  
		 
		 for(int i=0;i<5;i++) {
			 String kingdom = sc.next();
			 int x = sc.nextInt();
			 int y = sc.nextInt();
			 
			 if(x>0 && y>0) {
				 chola.add(kingdom);
			 }
			 else if(x<0 && y>0) {
				 chera.add(kingdom);
			 }
			 else if(x<0 && y<0) {
				 pallava.add(kingdom);
			 }
			 else if(x>0 && y<0) {
				 pandya.add(kingdom);
			 }
			 else {
				 renounce.add(kingdom);
			 }
		 }
		 
		 System.out.println("chola");
		 System.out.println(chola);
		 
		 System.out.println("chera");
		 System.out.println(chera);
		 
		 System.out.println("pallava");
		 System.out.println(pallava);
		 
		 System.out.println("pandya");
		 System.out.println(pandya);
		 
		 System.out.println("renounce");
		 System.out.println(renounce);
		 
	}

}
