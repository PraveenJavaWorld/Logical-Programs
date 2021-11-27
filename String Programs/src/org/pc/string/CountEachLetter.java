package org.pc.string;

import java.util.ArrayList;
import java.util.List;

public class CountEachLetter {

	public static void main(String[] args) {
		
		String s = "Nacre";
		List<Character> list = new ArrayList<Character>();
		List<Character> list1 = new ArrayList<Character>();
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]>=97 && c[i]<=122) {
				if(c[i]==97 || c[i]==101 || c[i]==105 || c[i]==111 || c[i]==117) {
					list.add(c[i]);
				}
				else {
					list1.add(c[i]);
				}
			}
			else if(c[i]>=65 && c[i]<=90) {
				if(c[i]==65 || c[i]==69 || c[i]==73 || c[i]==79 || c[i]==85) {
					list.add(c[i]);
				}
				else {
					list1.add(c[i]);
				}
			}
		}
		System.out.println(list);
		System.out.println(list1);
		System.out.println("Vowels are :: "+list.size());
		System.out.println("Consonants Letters are :: "+list1.size());
		
	}

}
