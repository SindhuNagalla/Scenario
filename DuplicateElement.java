package com.nit.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[]= {100,101,102,100,103,102,104};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+" ");
				}
			}
		}

	}

}
