package com.dillu.core.Array;
import java.util.Scanner;
public class Reverse {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements are");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
	    }
		System.out.println("Reverse of element are");
		 for(int j=arr.length-1;j>=0;j--)
		 {
			  System.out.println(arr[j]);
		 }
	}
}
