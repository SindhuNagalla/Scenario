package com.nit.Arrays;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		
		int arr[]= {10,40,30,20,90,80,70};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order:"+Arrays.toString(arr));
	}

}
