package org.pc.string;

public class SortIntegerArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int count = 10;
		for(int i=0;i<arr.length/2;i++) {
			System.out.print(arr[i]+" ");
			count--;
			System.out.print(arr[count]+" ");
		}
		

	}

}
