package com.dillu.core.Array;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc. nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the elements are ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		}
	}


