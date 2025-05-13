package com.nit.Arrays;

public class program2 {

	public static void main(String[] args) {
		int arr[]= {10,80,90,20,30,100,5};
		
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
		System.out.println("Second Smallest:"+arr[1]);
		System.out.println("Second Highest:"+arr[arr.length-2]);
	}

}
