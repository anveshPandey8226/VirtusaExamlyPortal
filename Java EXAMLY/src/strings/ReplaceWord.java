package strings;

import java.util.Scanner;

public class ReplaceWord {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String replaceString = s1.replace(s2,s3); 
		System.out.println(replaceString);  
	}

}
