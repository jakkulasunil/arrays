package com.arrays.basics;

import java.util.HashSet;

//Remove the duplicates from the sorted array.
public class RemoveDuplicatesFromSorted {

	static int removeDuplicates(int[] arr) {
		HashSet<Integer> s = new HashSet<>();

		int idx = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!s.contains(arr[i])) {
				s.add(arr[i]);
				arr[idx++] = arr[i];
			}
		}

		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int duplicates = removeDuplicates(arr);
		for (int i = 0; i < duplicates; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
