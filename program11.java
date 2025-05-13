package com.nit.Arrays;

import java.util.Arrays;

//use nested loop  to fetch each element and compare with remaining
//Validate and Swap the values
//print the elements
public class program11 {
	
	public static void main(String[] args)
	{
	int arr[]= {10,40,50,30,80};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	System.out.println("Smallest number:"+arr[0]);
	System.out.println("Largest number:"+arr[arr.length-1]);
	}
}
