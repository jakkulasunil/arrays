package com.arrays.basics;
//check if an array is sorted
public class CheckIfSorted {
	static boolean isSortedHelper(int[] arr, int n) {
		if (n == 1 || n == 0)
			return true;
		return arr[n - 1] >= arr[n - 1] && isSortedHelper(arr, n - 1);
	}

	public static boolean isSorted(int[] arr) {

		return isSortedHelper(arr, arr.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40};
		if(isSorted(arr))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
