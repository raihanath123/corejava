package com.dillu.core.Array;
import java.util.Scanner;
public class Descendingorder {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter element");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    	if(arr[i]<arr[j])
	    	{
	    		int temp=arr[i];
	    		arr[i]=arr[j];
	    		arr[j]=temp;
	    	}
	    	System.out.println("Descending order is");
	    	for(int k=0;k<arr.length;k++)
	    	{
	    		System.out.println(arr[k]);
	    	}
	    	}
	    }
		
	}

}
