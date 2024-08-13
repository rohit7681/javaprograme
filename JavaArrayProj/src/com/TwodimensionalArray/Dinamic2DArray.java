package com.TwodimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Dinamic2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:-");
		int row=sc.nextInt();
		System.out.println("Enter the column:-");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		{
			for(int i=1;i<=row;i++)
			{
				for(int j=0;j<col;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
		}
		
	}

}
