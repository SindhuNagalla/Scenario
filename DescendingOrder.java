package com.nit.Arrays;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		int arr[]= {90,10,30,80,60,40,50};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Descending Order:"+Arrays.toString(arr));
	}

}
