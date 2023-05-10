package strings;

import java.util.Scanner;

public class SortWordsLength {
	
	static void sort_elements(String []my_str, int n){
	      for (int i=1 ;i<n; i++){
	         String temp = my_str[i];
	         int j = i - 1;
	         while (j >= 0 && temp.length() < my_str[j].length()){
	            my_str[j+1] = my_str[j];
	            j--;
	         }
	         my_str[j+1] = temp;
	      }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		
		String[] strArray = null;  
		strArray = sent.split(" ");  
		int len = strArray.length;
		sort_elements(strArray,len);
	    for (int i=0; i<len; i++) {
	      System.out.print(strArray[i]+" ");
	    }
		
	}
	
	

}
