package com.dillu.core.Finallybloack;

import java.io.IOException;
public class Finallyblock {
	
		public static void main(String[]args)
		{
			System.out.println("Main Started");
			try
			{
				int a=10/0;
				a++;
			}
			
			catch(Exception e)
			{
				System.out.println("m4");
			}
			finally
			{
			System.out.println("m3");
			
			
			}
				
			System.out.println("Main ended");
			}
		}
	
	

