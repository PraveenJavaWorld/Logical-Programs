package org.pc.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeated {

	public static void main(String[] args) {
		
		String s = "Software Services";
		char[] c = s.toLowerCase().toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<=c.length-1;i++) {
			for(int j=0;j<=c.length-1;j++) {
				if(c[i]!=c[j]) {
					set.add(c[j]);
				}
			}
		}
		Object[] ob = set.toArray();
		System.out.println(ob[0]);

	}

}
