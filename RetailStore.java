package com.nit.Arrays;

import java.util.Arrays;

class Retail1 {
	int[] products= {101,102,103,101,104,105,101,102};
	public void displayRepeatedId()
	{
		Arrays.sort(products);
		System.out.println("Array elements:"+Arrays.toString(products));
		int repeatedCount=0;
		
		for(int i=0;i<products.length;i++)
		{
			int count=0;
			for(int j=0;j<products.length;j++)
			{
				if(products[i]==products[j] && i>j)
				{
					break;
				}
				if(products[i]==products[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(products[i]+"available"+count+"time");
				repeatedCount++;
			}
		}
		System.out.println("repeated Count:"+repeatedCount);
	}
}
public class RetailStore
{
	public static void main(String[] args)
	{
		Retail1 r1=new Retail1();
		r1.displayRepeatedId();
	}
}
