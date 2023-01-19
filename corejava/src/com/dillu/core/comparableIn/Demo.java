package com.dillu.core.comparableIn;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		//Comparable
		//Public int compareTo()
		//0 both are same
		//it returns positive number if current Instance is bigger than given Instance
		//it return negative number if current instance is smaller than given instance
		  String[]arr= {"java","php","c","android","sql"};
		     Arrays.sort(arr);//comparableIn
		     for(String s:arr)
		     {
		    	 System.out.println(s);
		     }
	}

}



