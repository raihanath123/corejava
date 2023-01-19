package com.dillu;

import java.util.ArrayList;

public class Evenoddelement {

	public static void main(String[] args)
	{
		int a[]= {2,8,3,5,46,12,9};
		ArrayList<Integer>al1=new ArrayList<>();
		ArrayList<Integer>al2=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			{
				al2.add(a[i]);
			}
		}
		System.out.println("even no's are");
		for(int no:al1)
		{
			System.out.print(no+"");
		}
		System.out.println("\n");
	
	System.out.println("total no is even number");
	System.out.println("odd no's are");
	for(int no:al2)
	{
		System.out.print(no+"");
	}
	System.out.println("");
		
}
}
