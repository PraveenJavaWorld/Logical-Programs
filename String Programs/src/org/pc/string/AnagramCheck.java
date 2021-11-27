package org.pc.string;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		
		String s1 = "reaction";
		String s2 = "creation";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
		boolean result = Arrays.equals(c1, c2);
		if(result) {
			System.out.println("Two Strings are Anagrams");
		}
		else {
			System.out.println("Two Strings are not Anagrams");
		}
		
	}

}
