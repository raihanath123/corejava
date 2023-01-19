package com.dillu.codingString.countvowels;

import java.util.Scanner;
public class Countnumbervowels {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char[]chars=str.toCharArray();
		int count=0;
		for(char c:chars) {
		
	    switch(c)
		{
	    case  'a':
	    case  'e':
	    case  'i':
	    case  'o':
	    case  'u':
	     count++;
	     break;
	    default:
	    	System.out.println("");
		}
		}
		System.out.println("Number of vowels in string="+count);
	}

}
