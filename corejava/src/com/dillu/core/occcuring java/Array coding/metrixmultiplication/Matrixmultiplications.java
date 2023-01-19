package com.dillu;

public class Matrixmultiplications {
	public static void main(String[] args) {
		
		int first[][]={ {1,2,3},{4,5,6},{12,3,4}};
		int second[][]= {{7,8},{10,2},{1,1}};
		int multi[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
					multi[i][j]=multi[i][j]+(first[i][k]*second[k][j]);
				}
			}
		}
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<2;j++)
		{
			System.out.print (multi[i][j]+" ");
		}
		System.out.println();
				}
			}
		
	}


