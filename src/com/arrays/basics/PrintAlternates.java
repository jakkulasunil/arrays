package com.arrays.basics;

import java.util.ArrayList;
import java.util.List;

//Write a Java Program to print alternates from the array.
public class PrintAlternates {

	public static List<Integer> printAlternatesfromArray(int[] arr) {

		List<Integer> list = new ArrayList<>();

		// Iterate the all the alternate elements
		for (int i = 0; i < arr.length; i += 2) {
			list.add(arr[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println();
		List<Integer> result = printAlternatesfromArray(arr);
		for (int res : result) {
			System.out.print(" " + res);
		}

	}

}
