package org.pc.string;

public class OccurenceCount {

	public static void main(String[] args) {
		
		String s = "apple";
		int occur[] = new int[s.length()];
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			occur[i] = 1;
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					occur[i]++;
					c[j] = '0';
				}
			}
		}
		for(int i=0;i<occur.length;i++) {
			if(c[i]!=' ' && c[i]!='0') {
				System.out.println(c[i]+" "+occur[i]+" ");
			}
		}
		
	}

}
