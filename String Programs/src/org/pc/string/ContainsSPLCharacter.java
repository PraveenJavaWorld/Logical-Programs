package org.pc.string;

import java.util.ArrayList;
import java.util.List;

public class ContainsSPLCharacter {

	public static void main(String[] args) {
		
		String s = "nacre@$";
		List<Character> list = new ArrayList<Character>();
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]>=33 && c[i]<=47 || c[i]>=58 && c[i]<=64 || c[i]>=91 && c[i]<=96 || c[i]>=123 && c[i]<=126) {
				list.add(c[i]);
			}			
		}
		System.out.println(list);
		if(!list.isEmpty()) {
			System.out.println("Given String Contains Special Characters");
		}
		else {
			System.out.println("Given String DoesNot Contains Special Characters");
		}
		
	}

}
