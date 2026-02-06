package com.arrays.basics;
//Rotate an array
public class RotateAnArray {

	static void arrayRotation(int[] arr, int d) {
		int n = arr.length;

		for (int i = 0; i < d; i++) {
			int last = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] last = { 1, 2, 3, 4, 5, 6 };
		int d = 2;
		arrayRotation(last, d);
		for (int i = 0; i < last.length; i++) {
			System.out.print(last[i] + " ");
		}
	}

}
