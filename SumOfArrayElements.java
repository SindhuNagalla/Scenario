package com.nit.Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int arr[]= {10,20,33,42,87};
		int sum=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements:"+sum);

	}

}
