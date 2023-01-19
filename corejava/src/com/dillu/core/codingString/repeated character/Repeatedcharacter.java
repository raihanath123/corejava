package com.dillu.codingString;

public class Repeatedcharacter {
	public static void main(String[] args) {
		
		String str="this is best moment";
		char[]array= str.toCharArray();
		System.out.println("String is:"+  str);
		System.out.println("repeated charcter from in above string are:");
		for(int i=0;i<str.length();i++)
		{
		for(int j=i+1;j<str.length();j++)
		{
			if(array[i]==array[j])
			{
				System.out.print(array[j] +" ");
				break;
				
			}

		}
		}
	}

}
