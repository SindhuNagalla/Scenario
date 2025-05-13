package com.nit.Arrays;

public class checkSpecificElement {

	public static void main(String[] args) {
		
		int[] arr= {10,30,80,40,70,50};
		int key=20;
		boolean value=false;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				value=true;
				break;
			}
		}
		if(value==true)
		{
			System.out.println("Specific element found");
		}
		else
		{
			System.out.println("Specific element not found");
		}
		
	}

}
