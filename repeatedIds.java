package com.nit.Arrays;

import java.util.Arrays;
class productIds
{
	int ids[]= {101,102,103,101,104,105,102};
	public void findrepeatedIds()
	{
		Arrays.sort(ids);
		System.out.println("Array Elements:"+Arrays.toString(ids));
		int occurenceCount=0;
		for(int i=0;i<ids.length;i++)
		{
			int count=0;
			for(int j=0;j<ids.length;j++)
			{
			if(ids[i]==ids[j] && i>j)
			{
				break;
			}
			if(ids[i]==ids[j])
			{
				count++;
			}
		}
			if(count>1)
			{
				System.out.println(ids[i]+" available "+count+" time");
				occurenceCount++;
			}
		}
		System.out.println(occurenceCount+" product Ids are repeated.");
	}
}
public class repeatedIds {

	public static void main(String[] args) {
		productIds pi=new productIds();
		pi.findrepeatedIds();
	}
}
