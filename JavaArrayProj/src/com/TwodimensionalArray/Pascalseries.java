package com.TwodimensionalArray;

public class Pascalseries {
	static int[][] pascal(int size)
	{
		int[][] a=new int[size][];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0||i==j)
				{
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
			
		return a;
	}

	public static void main(String[] args) 
	{
		int size=5;
		int[][] a=pascal(size);
		int space=size-1;
		for(int[] b:a)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int n:b)
			{
				System.out.print(n+" ");
			}
			System.out.println();
			space--;
		}	
	}

}
