package com.dillu.core.Execeptions;

public class E {
	public static void main(String[] args) {
		
		int arr[]=new int [3];
		
		try
		{
			arr[3]=55;
		}
		catch(Exception e)
		{
			System.out.println("invlaidexception!");
		}
		
	}

}
