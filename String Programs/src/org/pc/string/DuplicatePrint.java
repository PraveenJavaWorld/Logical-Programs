package org.pc.string;

public class DuplicatePrint {

	public static void main(String[] args) {
		
		String s = "programming";
		char[] sc = new char[s.length()];
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					sc[i] = c[j];
				}
			}
		}
		System.out.println(sc);
						
	}

}
