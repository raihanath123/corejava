package com.dillu.core.Array;
import java.util.Scanner;
public class Smallest {
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size");
		 int size  =sc.nextInt();
		 int arr[]=new int[size];
		 System.out.println("Enter the array elements are");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 int min=arr[0];
		 for(int i=1;i<arr.length;i++)
		 {
			 if (arr[i]<min)
				 min=arr[i];
		 }
		 System.out.println("smallest value of array= "+min);
	}

}
