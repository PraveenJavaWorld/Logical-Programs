package org.pc.string;

import java.util.Arrays;

public class DisplaySecondHighestNumber {

	public static void main(String[] args) {
		
		int[] arr = {15000,5000,1000,23000,12000,25000};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}
