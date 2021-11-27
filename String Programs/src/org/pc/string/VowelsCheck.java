package org.pc.string;

import java.util.ArrayList;
import java.util.List;

public class VowelsCheck {

	public static void main(String[] args) {
		
		String s = "nacre123";
		List<Character> list = new ArrayList<Character>();
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]==97 || c[i]==101 || c[i]==105 || c[i]==111 || c[i]==117) {
				list.add(c[i]);
			}			
		}
		System.out.println(list);
		if(!list.isEmpty()) {
			System.out.println("Given String Contains Vowels");
		}
		else {
			System.out.println("Given String DoesNot Contains Vowels");
		}
		
	}

}
