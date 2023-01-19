package com.dillu.core.Array;
import java.util.Scanner;
public class Linearsearch {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array element of array are:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag=0;
		System.out.println("Enter the search element");
		int ele=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("search element is found");
			
		}
		else
		{
			System.out.println("Search element is not found");
					
			}
		}
		
	}


