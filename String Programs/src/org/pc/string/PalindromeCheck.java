package org.pc.string;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String for Palindrome check");
		String s = sc.next();
		
		/*StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if(s.contentEquals(sb)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is Not Palindrome");
		}*/
		
		char[] c = s.toCharArray();
		char[] c1 = new char[s.length()];
		
		for(int i=s.length()-1;i>=0;i--) {
			c1[s.length()-i-1] = c[i];
		}
		System.out.println(c1);
		if(Arrays.equals(c, c1)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is Not Palindrome");
		}
		
	}

}
