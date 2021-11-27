package org.pc.string;

public class ClockAndAntiClock {
	
	public static void clockwise(int[] a,int[] b,int[] c) {
		System.out.println(c[0]+" "+b[0]+" "+a[0]);
		System.out.println(c[1]+" "+b[1]+" "+a[1]);
		System.out.println(c[2]+" "+b[2]+" "+a[2]);
	}
	
	public static void anticlockwise(int[] a,int[] b,int[] c) {
		System.out.println(a[2]+" "+b[2]+" "+c[2]);
		System.out.println(a[1]+" "+b[1]+" "+c[1]);
		System.out.println(a[0]+" "+b[0]+" "+c[0]);
	}

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] c = {7,8,9};
		
		System.out.println("Given Pattern is :: ");
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		System.out.println(b[0]+" "+b[1]+" "+b[2]);
		System.out.println(c[0]+" "+c[1]+" "+c[2]);
		
		System.out.println("Clockwise Pattern is :: ");
		clockwise(a, b, c);
		System.out.println("Anticlockwise Pattern is :: ");
		anticlockwise(a, b, c);
	}

}
