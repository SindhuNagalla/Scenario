package com.nit.Arrays;

public class FrequencyElement {

	public static void main(String[] args) {
		int arr[]= {100,101,200,201,300,301,400,200,100};
		boolean repeat=false;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					repeat=true;
				}
			}
			if(repeat=true)
			{
				System.out.println(arr[i]+"Occurs"+count+"times");
			}
		}
		
		
	}

}
