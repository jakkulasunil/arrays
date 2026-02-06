package com.arrays.basics;

//Array Reverse
public class ReverseAnArray {

	static void reverseArray(int[] arr) {
		int n = arr.length;

		int[] temp = new int[n];

		for (int i = 0; i < n; i++)
			temp[i] = arr[n - i - 1];

		for (int i = 0; i < n; i++)
			arr[i] = temp[i];

	}

	static void arrayReverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		// iterate the till left is less than right
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			// increment the left pointer
			left++;
			// decrement the right pointer
			right--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 2, 6, 5 };
//		reverseArray(arr);
		arrayReverse(arr);
		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");
	}

}
