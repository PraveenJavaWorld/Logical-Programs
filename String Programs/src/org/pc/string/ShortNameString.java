package org.pc.string;

import java.util.ArrayList;
import java.util.List;

public class ShortNameString {

	public static void main(String[] args) {
		
		String s1 = "Sanjeeva Reddy Nagar";
		String[] s2 = s1.split(" ");
		String[] s3 = new String[s2.length];
		int i = -1;
		for(String ss:s2) {
			i++;
			s3[i] = ss;
		}
		
		
		/*List<String> list = new ArrayList<String>();
		for(String ss:s2) {
			list.add(ss);
		}
		String ss1 = list.get(0);
		String ss2 = list.get(1);
		String ss3 = list.get(2);
		char c1 = ss1.charAt(0);
		char c2 = ss2.charAt(0);
		String result = c1+""+c2+" "+ss3;
		//String result1 = ss1.charAt(0)+""+ss2.charAt(0)+" "+ss3;
		System.out.println(result);*/
		
		
	}

}
