package com.week1.q02;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "NewyorkE";
		int[] arr = {'A', 'E', 'I', 'O', 'U'};
		int count = 0;
		String upper = str.toUpperCase();
		for(int i=0; i<arr.length; i++) {
			if(upper.indexOf(arr[i]) > -1) {
				count += 1;
			}
		}
		System.out.printf("Number of vowels present in the given string is %d", count);
	}
}
