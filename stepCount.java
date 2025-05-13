package com.nit.Arrays;

import java.util.Scanner;

public class stepCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of steps");
		int steps[]=new int[10];
		int sum=0;
		for(int j=0;j<steps.length;j++)
		{
			steps[j]=sc.nextInt();
		}
		int avg=0;
		for(int i=0;i<steps.length;i++)
		{
			sum=sum+steps[i];
			avg=sum/10;
		}
		System.out.println("Sum of steps for 10 days:"+sum);
		System.out.println("Average steps per day:"+avg);
	}

}
