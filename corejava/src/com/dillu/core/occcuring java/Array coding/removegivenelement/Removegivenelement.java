package com.dillu;

public class Removegivenelement {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int del_ele=40;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(del_ele==a[i])
			{
			
			for(int j=i;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			count=count+1;
			break;
			}
		}
		if(count==0)
		{
			System.out.println("element is not found");
			
		}
		else
		{
			System.out.println("element is deleted is sucessfully");
			for(int i=0;i<a.length-1;i++)
			{
				System.out.println(a[i]+"");
			}
		}
	}
}
