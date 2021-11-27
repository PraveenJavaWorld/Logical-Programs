package org.pc.string;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String s = "Java";
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		for(int j=s.length();j>0;j--) {
			
			System.out.print(s.charAt(j-1));
		}

	}

}
