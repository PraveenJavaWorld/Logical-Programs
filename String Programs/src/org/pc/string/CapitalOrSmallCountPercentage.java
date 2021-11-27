package org.pc.string;

import java.util.ArrayList;
import java.util.List;

public class CapitalOrSmallCountPercentage {

	public static void main(String[] args) {
		
		String s = "Nacre Software";
		List<Character> list = new ArrayList<Character>();
		List<Character> list1 = new ArrayList<Character>();
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]>=65 && c[i]<=90) {
				list.add(c[i]);
			}
			else if(c[i]>=97 && c[i]<=122) {
				list1.add(c[i]);
			}
			
		}
		System.out.println(list);
		System.out.println(list1);
		System.out.println("Capital Letters are :: "+list.size());
		System.out.println("Small Letters are :: "+list1.size());
		System.out.println("Capital Letters % :: "+100*list.size()/s.length()+"%");
		System.out.println("Small Letters % :: "+100*list1.size()/s.length()+"%");
		
	}

}
