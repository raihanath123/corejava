package com.dillu.core.Array;

public class MultiDiamsionalarray {
	public static void main(String[] args) {
		
		int arr[][]=new int[3][4];
		arr[0][0]=10;
		arr[0][1]=25;
		arr[0][2]=50;
		arr[1][0]=10;
		arr[1][1]=41;
		arr[1][2]=11;
		arr[2][0]=21;
		arr[2][1]=15;
		arr[2][2]=75;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
			}
		}
	}

