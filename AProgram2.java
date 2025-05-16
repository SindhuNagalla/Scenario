package com.nit.FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class AProgram2{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		Function<Integer,Integer> f1=(a)->{
			System.out.println(a+a);
			return a;
			};
		Function<Integer,Integer> f2=(b)->{
			System.out.println(b*b);
			return b;
			};
		System.out.println("double of given number"+f1.apply(num));
		System.out.println("square of given number"+f2.apply(num));
			
	}

}
