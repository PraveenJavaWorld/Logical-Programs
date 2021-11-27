package org.pc.string;

public class DuplicateOccurenceCount {

	public static void main(String[] args) {
		
		String s = "programming";
		char[] sc = new char[s.length()];
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count = 1;
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					count++;
					sc[i] = c[j];
				}
			}
			if(count>1) {
				System.out.println(c[i]+ " "+ count);
			}
		}
						
	}

}
