package com.nit.Arrays;
import java.util.Scanner;

public class FindMinSales {

	public static void main(String[] args) {
		//min sale in the array list
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sales in the week");
		int sales[]=new int[7];

		for(int i=0;i<sales.length;i++)
		{
			sales[i]=sc.nextInt();
		}
		int min=sales[0];
		for(int j=0;j<sales.length;j++) {
				if(sales[j]<min) 
				{
					min=sales[j];
				}
			}
			
			System.out.println("Minimum sales in the week"+min);
			
		//To find maximum in the Array List
			int max=sales[0];
			for(int k=0;k<sales.length;k++)
			{
				sales[k]=sc.nextInt();
			}
			for(int l=0;l<sales.length;l++)
			{
				if(sales[l]>max)
				{
					max=sales[l];
				}
			}
			System.out.println("Maximum sales in the week:"+max);
		}
		

	}


