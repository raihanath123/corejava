package com.dillu.core;
import java.util.Scanner;
public class Reve {
	
	public static void main(String[] args) {
		
		
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter your string");
			String s1=scn.nextLine();
			String r=reverse(s1);
			
			System.out.println("Reverse of a Given String is  " +r);
		}
	}
		
		
		
		public static String reverse (String s)
		{
			String rev="";
		    if(s==null)
		    {
		    	return null;
		    	
		    }
		    for(int i=s.length()-1;i>=0;i--)
		    {
		    	rev+=s.charAt(i);
		    }
		    return rev;
		    }
		    	
		
	
	}

 
