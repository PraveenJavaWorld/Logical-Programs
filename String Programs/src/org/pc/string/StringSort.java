package org.pc.string;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		
		String s = "nacre";
		char[] c = s.toCharArray();
		char temp;
		/*Arrays.sort(c);
		System.out.println(c);*/
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(c[j]>c[i]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println(c);
	}

}
