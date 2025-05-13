package com.nit.Arrays;

public class Warehouse {
	
	public static int findSecondHighestStock(int[] stocks1)
	{
		if(stocks1 == null || stocks1.length<2)
		{
			return -1;
		}
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int num:stocks1)
		{
			if(num>max)
			{
				smax=max;
				max=num;
			}
			else if(num<max && num>smax)
			{
				smax=num;
			}
		}
		return (smax==Integer.MIN_VALUE)?-1:smax;
	}

	public static void main(String[] args) {
		int[] stocks1= {123,321,345};
		System.out.println(findSecondHighestStock(stocks1));
		}

}
