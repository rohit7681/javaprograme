package Algorithim;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a= new int[5];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the array element:-");
			a[i]=sc.nextInt();
		}
		System.out.println("Array element are:-");
		System.out.println(Arrays.toString(a));
		sort(a);

	}
	
	public static void sort(int[] a)
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
