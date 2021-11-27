package org.pc.string;

import java.util.ArrayList;
import java.util.List;

public class ContainsDigit {

	public static void main(String[] args) {
		
		String s = "nacre123";
		List<Character> list = new ArrayList<Character>();
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]>=48 && c[i]<=57) {
				list.add(c[i]);
			}			
		}
		System.out.println(list);
		if(!list.isEmpty()) {
			System.out.println("Given String Contains Digits");
		}
		else {
			System.out.println("Given String DoesNot Contains Digits");
		}
		
		/*if(list.contains('0')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('1')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('2')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('3')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('4')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('5')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('6')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('7')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('8')) {
			System.out.println("Given String Contains Digits");
		}
		else if(list.contains('9')) {
			System.out.println("Given String Contains Digits");
		}
		else {
			System.out.println("Given String DoesNot Contains Digits");
		}*/	
	}

}
