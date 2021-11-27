package org.pc.string;

public class ClockAndAntiClockDynamic {
	
	public static void clockwise(int[] a,int[] b,int[] c) {
		for(int i=0;i<a.length;i++) {
			System.out.println(c[i]+" "+b[i]+" "+a[i]);
		}
	}
	
	public static void anticlockwise(int[] a,int[] b,int[] c) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]+" "+b[i]+" "+c[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] c = {7,8,9};
		
		System.out.println("Given Pattern is :: ");
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		System.out.println(b[0]+" "+b[1]+" "+b[2]);
		System.out.println(c[0]+" "+c[1]+" "+c[2]);
		
		if(a.length!=b.length || a.length!=c.length || b.length!=c.length) {
			System.out.println("The size of each array should be Equal");
		}
		else {
			System.out.println("Clockwise Pattern is :: ");
			clockwise(a, b, c);
			System.out.println("Anticlockwise Pattern is :: ");
			anticlockwise(a, b, c);
		}
		
	}

}
