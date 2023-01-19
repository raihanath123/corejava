package com.dillu.core.Array;
import java.util.Scanner;
public class Selectionsort {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element are");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
	    }
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			   int small=arr[index];
			   arr[index]=arr[i];
			   arr[i]=small;
		}
		System.out.println("Selection sort output");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	
		}

}
