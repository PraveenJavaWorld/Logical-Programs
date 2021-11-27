package org.pc.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {

	public static void main(String[] args) {
		
		String s = "bananas";
		char[] c = s.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<=c.length-1;i++) {
			set.add(c[i]);
		}
		System.out.println(set);
		set.forEach(System.out::print);
	}

}
