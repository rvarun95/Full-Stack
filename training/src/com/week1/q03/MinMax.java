package com.week1.q03;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {19, 17, 12};
		int max = getMax(arr);
		System.out.println(max);
		int min = getMin(arr);
		System.out.println(min);
		System.out.println("The sum of min and max of given array is : " + (min + max));
	}
	
	public static int getMax(int[] givenArray) {
		int max = givenArray[0];
		for(int i = 1; i<givenArray.length; i++) {
			if(max < givenArray[i]) {
				max = givenArray[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[] givenArray) {
		int min = givenArray[0];
		for(int i = 1; i<givenArray.length; i++) {
			if(min > givenArray[i]) {
				min = givenArray[i];
			}
		}
		return min;
	}

}
