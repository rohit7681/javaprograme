package Algorithim;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementInTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st Array:-");
		int size$1=sc.nextInt();
		System.out.println("Enter the size of 2nd Array:-");
		int size$2=sc.nextInt();
		int[] a= new int[size$1];
		int[] b= new int[size$2];
		for(int k=0;k<a.length;k++)
		{
			System.out.println("Enter 1st Array element on"+" "+k+" "+"index =");
			a[k]=sc.nextInt();
		}
		System.out.println("1st Array = "+Arrays.toString(a));
		for(int l=0;l<b.length;l++)
		{
			System.out.println("Enter 2nd Array element on"+" "+l+" "+"index =");
			b[l]=sc.nextInt();
		}
		
		System.out.println("2nd Array = "+Arrays.toString(b));
		System.out.println("Common element in between two array");
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
