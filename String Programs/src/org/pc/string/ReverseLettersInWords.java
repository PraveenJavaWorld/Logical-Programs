package org.pc.string;

public class ReverseLettersInWords {

	public static void main(String[] args) {
		
		String s = "Today is Monday";
		String[] s1 = s.split(" ");
		String result = "";
		for(String ss:s1) {
			StringBuffer sb = new StringBuffer(ss);
			sb.reverse();
			result = result+" "+sb;
		}
		
		System.out.println(result);

	}

}
