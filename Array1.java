package com.nit.Arrays;

/*i). Display all the elements
ii). Display the elements which are divisible by 5
iii). Display the positive elements
iv) . Display the negative elements
v).  Display the the sum of all the elements
vi). Display the elements which are divisible by both 2 and 3.*/
import java.util.Scanner;

public class Array1 {
	public static void displayAllElements(int arr[])
	{
		System.out.println("Elements stored in an array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void displayAllElementsDivisibleBy5(int arr[])
	{
		System.out.println("Elements divisible by 5 which are stored");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println("arr[i]");
			}
		}
	}
	
	public static void displayPositiveElements(int arr[])
	{
		System.out.println("Positive Elements:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				System.out.println("arr[i]");
			}
		}
	}
	
	public static void displayNegativeElements(int arr[])
	{
		System.out.println("Negative Elements:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.println("arr[i]");
			}
		}
	}
	
	  public static void displaySumOfElements(int arr[]) {
	        int sum=0;
	        for(int i=0;i<arr.length;i++) {
	            sum = sum+arr[i];
	        }
	        System.out.println("Sum is: "+sum);
	    }
	
	public static void displayAllElementsDivisibleBy2_3(int arr[])
	{
		System.out.println("Elements divisible by 5 which are stored");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0 && arr[i]%3==0)
			{
				System.out.println("arr[i]");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of elements stored in the array:");
		int size=sc.nextInt();
		if(size>0)
		{
			int arr[]=new int[size];
			System.out.println("Array Created");
			System.out.println("Enter "+size+" Elements in the array");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Elements Entered Successfully");
			System.out.println("Enter your Choice:");
			System.out.println("i). Display all the elements\r\n"
					+ "   ii). Display the elements which are divisible by 5\r\n"
					+ "   iii). Display the positive elements\r\n"
					+ "   iv) . Display the negative elements\r\n"
					+ "   v).  Display the the sum of all the elements\r\n"
					+ "   vi). Display the elements which are divisible by both 2 and 3.");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				displayAllElements(arr);
				break;
			case 2:
				displayAllElementsDivisibleBy5(arr);
				break;
			case 3:
				displayPositiveElements(arr);
				break;
			case 4:
				displayNegativeElements(arr);
				break;
			case 5:
				displaySumOfElements(arr);
				break;
			case 6:
				displayAllElementsDivisibleBy2_3(arr);
				break;
				default:
					System.out.println("Invalid");
			}
		}
		else
		{
			System.out.println("Array size should not be negative");
		}

	}

}
