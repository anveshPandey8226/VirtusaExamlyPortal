package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		int len = str.length();
		
		HashSet<Character> unique = new HashSet<Character>();
		StringBuffer result = new StringBuffer();;
		
		for(int i = 0; i < str.length(); i++){
	        unique.add(str.charAt(i));
	    }
		
		ArrayList<Character> uniqueList = new ArrayList<>(unique);
		
		for(int i = 0; i<uniqueList.size() ; i++) {
			for (int j = 0 ; j<len; j++) {
				if((uniqueList.get(i)).equals(str.charAt(j))) {
					result.append(str.charAt(j));
				}
			}
		}
		
		String ans = result.toString();
		System.out.println(ans);
	}

}
