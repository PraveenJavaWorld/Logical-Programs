package org.pc.string;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String s = "Java is best programming language";
		String[] s2 = s.split(" ");
		String result = "";
		for(int i=0;i<s2.length;i++) {
			result = " "+s2[i]+result;
			/*if(i==s2.length-1) {
				result = s2[i]+result;
			}
			else {
				result = " "+s2[i]+result;
			}*/
		}
		System.out.println(result);	
		
	}

}
