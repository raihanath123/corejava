package com.dillu.core.palindrom;

import java.util.Scanner;
public class Palindr {

	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter your String");
	String s1=scn.nextLine();
	s1=s1.toLowerCase();
	int flag=0;
	int n=s1.length();
	for(int i=0;i<n/2;i++)
	{
		if(s1.charAt(i)==s1.charAt(n-1-i))
		{
			flag=1;
		}
	}
	if(flag==1)
	{
		System.out.println("Given String is palindrome");
	}
	else
	{
		System.out.println("given String is not palindrome");
	}
	
	
	}	
}

