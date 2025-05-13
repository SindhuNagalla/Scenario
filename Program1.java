package com.nit.Arrays;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		int[] arr= {12,13,15,68,8,97};
		
		//using predefined method
		Arrays.sort(arr);
		int min=arr[1];
		int max=arr[arr.length-2];
		System.out.println(min);
		System.out.println(max);
		
		//Without using predefined method
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<min)
//			{
//				min=arr[i];
//			}
//		}
//		System.out.println("Minimum number:"+min);
	}

}
