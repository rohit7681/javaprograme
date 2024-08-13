package com.TwodimensionalArray;

public class Demo01 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		/*for(int i = 0;i < a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}*/
		for(int[] b:a)
		{
			for(int n:b)
			{
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
