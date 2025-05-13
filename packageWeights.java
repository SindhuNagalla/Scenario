package com.nit.Arrays;
import java.util.Scanner;

class Weights
{
	int w[]=new int[10];
	int pos;
	public void takeWeights(int[] w)
	{
		for(int i=0;i<w.length;i++)
		{
			this.w[i]=w[i];
		}
	}
	public void findPackage(int key)
	{
		boolean isPresent=false;
		
		for(int i=0;i<w.length;i++)
		{
			if(key==w[i])
			{
				isPresent=true;
				pos=i;
				break;
			}
		}
		if(isPresent==true)
		{
			System.out.println("Student with rollnumber "+key+" is present"+pos);
		}
		else
		{
			System.err.println("Student is not present");
		}
	}
}
public class packageWeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weights in the package:");
		int[] Weights=new int[10];
		
		for(int i=0;i<Weights.length;i++)
		{
			Weights[i]=sc.nextInt();
		}
		
		Weights w=new Weights();
		w.takeWeights(Weights);
		
		System.out.println("Enter the Weight to search:");
		int key=sc.nextInt();
		w.findPackage(key);
	}

}
