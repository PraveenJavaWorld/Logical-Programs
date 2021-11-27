package org.pc.string;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		
		String s1 = "Nacre Software";
		char[] c = s1.toCharArray();
		char[] c1 = new char[s1.length()];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to remove");
		char c2 = sc.next().charAt(0);
		for(int i=0;i<s1.length();i++) {
			if(c[i]!=c2) {
				c1[i] = c[i];
			}
		}
		System.out.println(c1);
	}

}
