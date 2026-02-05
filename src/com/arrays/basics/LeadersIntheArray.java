package com.arrays.basics;

import java.util.ArrayList;

//Find the leaders in the array which is greater than all the right side element
//in the array
public class LeadersIntheArray {

	//Function to iterate the leaders in the array.
	static ArrayList<Integer> leaders(int[] arr){
		ArrayList<Integer> result=new ArrayList<>();
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int j;
			
			for(j=i+1;j<n;j++) {
				if(arr[i]<arr[j])
					break;
			}
			
			if(j==n)
				result.add(arr[i]);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {16,17,4,3,5,2};
		
		ArrayList<Integer> result=leaders(arr);
		for(int res:result) {
			System.out.print(res+" ");
		}
		System.out.println();
	}

}
