package org.pc.string;

import java.util.Scanner;

public class SwapFirstLast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		char c = s.charAt(0);
		char c1 = s.charAt(s.length()-1);
		System.out.print(c1);
		for(int i=1;i<s.length()-1;i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println(c);

	}

}
