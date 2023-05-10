package strings;

import java.util.Scanner;

public class RemoveMultipleSpace {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String resultStr = str1.replaceAll("[ ]+", " ");
        System.out.print(resultStr);
    }

}
