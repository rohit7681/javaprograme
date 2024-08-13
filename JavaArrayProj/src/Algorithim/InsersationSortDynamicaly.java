package Algorithim;

import java.util.Arrays;
import java.util.Scanner;

public class InsersationSortDynamicaly {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:-");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the element on"+" "+i+" "+"Index =");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for(int j=1;j<a.length;j++)
		{
			int key=a[j];
			int k=j-1;
			while(k>-1 && a[k]>key)
			{
				a[k+1]= a[k];
				k--;
			}
			a[k+1]=key;
		}
		System.out.println(Arrays.toString(a));
	}

}
