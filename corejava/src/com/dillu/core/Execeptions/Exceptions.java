package com.dillu.core.Execeptions;

import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		//System.out.println();
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		try
		{
			System.out.println("try start");
			c=a/b;
			System.out.println("try end");
		}catch (Exception e)
		{
			System.out.println("catch block started");
			c=0;
			System.out.println("catch bloack started");
		}
		System.out.println(c);
	
		}
		
	}


