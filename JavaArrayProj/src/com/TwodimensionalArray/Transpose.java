package com.TwodimensionalArray;



public class Transpose 
{

	public static void main(String[] args)
	{
		int[][] a= { {1,2,3},
					 {4,5,6},
					 {7,8,9}
				   };
		System.out.println("Enter Matrix is=");
		for(int[] s:a)
		{
			for(int p:s)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix is=");
	int[][] b=transpose(a);
	{
		for(int[] t:b)
		{
			for(int m:t)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

	}
 static int[][] transpose(int[][] a)
 {
	 int len=a.length;
	 int[][] b=new int[len][len];
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
		 {
			 b[j][i]=a[i][j];
		 }
	 }
	 return b;
 }
}
