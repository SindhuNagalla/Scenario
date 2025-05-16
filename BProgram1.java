package com.nit.FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Consumer;

public class BProgram1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of products");
		int noOfProducts=sc.nextInt();
		
		double originalPrices[]=new double[noOfProducts];
		
		for(int i=0;i<noOfProducts;i++)
		{
			System.out.println("Enter the original price:"+(i+1));
			originalPrices[i]=sc.nextDouble();
		}
		
		Consumer<Double> discountedPrice=(price)->{
			double Discount=price-(price*0.10);
			System.out.println("Discounted price:"+Discount);
		};
		
		for(double price:originalPrices)
		{
			discountedPrice.accept(price);
		}
	}
}
