package strings;

import java.util.Scanner;

public class CountLines {
	
	private static int countLines(String str){
		   String[] lines = str.split("\r\n|\r|\n");
		   return  lines.length;
		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sent = "";
		String in;
		while(true) {
			in = s.nextLine();
			if(in.equals("q")) {
				break;
			}
			sent = sent + in + "\r\n";
		}
		
		int num = countLines(sent);
		System.out.println(num);
	}

}
