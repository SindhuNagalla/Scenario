package com.nit.Arrays;

import java.util.Scanner;
public class registrationIds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of elements stored in the array:");
		int size=sc.nextInt();
		if(size>0)
		{
			int registrationids[]=new int[size];
			System.out.println("Array Created");
			System.out.println("Enter "+size+" Elements in the array");
			for(int i=0;i<size;i++)
			{
				registrationids[i]=sc.nextInt();
			}
			System.out.println("ids stored successfully");
			for (int i = 0; i < size; i++) {
            System.out.println(registrationids[i]);
			}
		}
	else 
	{
        System.out.println("Invalid size. Array cannot be created.");
    }
	}

}
