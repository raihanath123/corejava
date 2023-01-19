package com.dillu.core.Array;
import java.util.Scanner;
public class Multidia {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 int rows=0;int cols=0;int res[][]=new int[0][0];
		System.out.println("Enter the number of rows of an First matrix");
		rows=sc.nextInt();
		System.out.println("Enter the number of colums of matrix");
		cols=sc.nextInt();
		int[][]fir=new int[rows][cols];
		System.out.println("enter the elements");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				fir[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
			System.out.println("Enter the number of rows of second matrix ");
			rows=sc.nextInt();
			System.out.println("Enter the number of  rows of second matrix");
			cols=sc.nextInt();
			int[][]sec=new int[rows][cols];
			System.out.println("Enter the elements");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
			
					sec[i][j]=sc.nextInt();
					
				}
				System.out.println();
			}
			int res[][]=new int[rows][cols];
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					res[i][j]=fir[i][j]+sec[i][j];
				}
				System.out.println();
			}
				
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<cols;j++)
					{
						
					System.out.print(res[i][j]);
					}
					System.out.println();
				}
				}
	}

		
	
	


