package com.nit;

import java.util.Arrays;
import java.util.Scanner;

public class programs {
	
	public static void countVowelConsonants(String str)
	{
		int vcount=0,ccount=0;
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch>='a' && ch>='z') || (ch>='A' && ch>='Z'))
			{
				if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
				{
					vcount++;
				}
				else
				{
					ccount++;
				}
			}
		}
		System.out.println("Vowels count:"+vcount);
		System.out.println("Consonants count:"+ccount);
	}
	
	public static void reverseString(String str)
	{
		String rev="";
		char ch;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println("Reverse is:"+rev);
	}
	
	public static void checkPalindrome(String str)
	{
		String rev="";
		char ch;
		for(int j=str.length()-1;j>=0;j--)
		{
			ch=str.charAt(j);
			rev=rev+ch;
		}
		if(rev.equals(str))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given String is not a plaindrome");
		}
	}
	public static void countWords(String str)
	{
		char ch;
		int count=1;
		for(int i=0;i<str.length()-1;i++) 
		{
			ch=str.charAt(i);
			if(ch>=i && ch==' ') 
			{
				count++;
			}
		}
		System.out.println("count of words:"+count);
	}
	
	//if if has 2 spaces between words
	public static void countWords1(String str)
	{
		String words[]=str.trim().split("\\s+");
		System.out.println(Arrays.toString(words));
		System.out.println("No.of words:"+words.length);
	}
	
	public static void  convertTitleCase(String str)
	{
		String words[]=str.trim().split("\\s+");
		System.out.println(Arrays.toString(words));
		System.out.println("No.of words:"+words.length);
		char ch;
		for(int i=0;i<words.length;i++)
		{
			ch=words[i].charAt(0);
			if(ch>='a' && ch<='z')
			{
				ch=(char) (ch-32);
				words[i]=ch+words[i].substring(1);
				
			}
		}
		System.out.println("New Word:"+Arrays.toString(words));
	}
	
	public static void frequecyCharacters(String str)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String str=sc.nextLine();
		countVowelConsonants(str);
		reverseString(str);
		checkPalindrome(str);
		countWords(str);
		countWords1("   Hii   how   are   you  ");
		convertTitleCase(str);
	}

}
