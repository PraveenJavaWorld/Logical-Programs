package org.pc.string;

import java.util.ArrayList;
import java.util.List;

public class AllEachCount {

	public static void main(String[] args) {
		
		String s = "Nacre@123%";
		List<Character> list = new ArrayList<Character>();
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]>=65 && c[i]<=90 || c[i]>=97 && c[i]<=122) {
				list.add(c[i]);
			}
			else if(c[i]>=48 && c[i]<=57) {
				list1.add(c[i]);
			}
			else {
				list2.add(c[i]);
			}
		}
		System.out.println(list);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("Characters are :: "+list.size());
		System.out.println("Digits are :: "+list1.size());
		System.out.println("Special Characters are :: "+list2.size());
		
	}

}
