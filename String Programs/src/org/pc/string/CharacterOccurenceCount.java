package org.pc.string;

import java.util.Scanner;

public class CharacterOccurenceCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		
		String s = "Today is Monday";
		
		int count = 0;
		char[] c1 = s.toLowerCase().toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c1[i]==c) {
				count++;
			}			
		}
		System.out.println(count);
		System.out.println("Given Character "+c+" occurence is "+count+" times");
		
	}

}
