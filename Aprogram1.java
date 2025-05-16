package com.nit.FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class Aprogram1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		Predicate<Integer> p1=(a)->{
						if(a>0)
						{
							return true;
						}
						else
						{
							return false;
						}
						};
		Predicate<Integer> p2=(b)->{
					int count=0;
					if(b!=1)
					{
						for(int i=2;i<=b/2;i++)
						{
							if(b%i==0)
							{
								count++;
							}
						}
						if(count==0)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else
					{
						return false;
					}
				};
		System.out.println(num+" is positive "+p1.test(num));
		System.out.println(num+" is prime "+p2.test(num));
		}

	}
