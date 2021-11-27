package org.pc.string;

public class PermutationString {
	
	public static void main(String[] args) {
		
		String s = "abc";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			String s2 = s.substring(0, i) + s.substring(i+1);
			System.out.print(s2+" ");
		}
	}

}
