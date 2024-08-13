package com.BasicArray;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int size=sc.nextInt();
		System.out.println("How many times you want to rotate:-");
		int n=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element of array:-");
			a[i]=sc.nextInt();
		}
		System.out.println("Before Rotation"+Arrays.toString(a));
		for(int j=1;j<=n;j++)
		{
		rotate(a);
		}
		System.out.println("After rotation"+Arrays.toString(a));

	}
	static int[] rotate(int[] a)
	{
		int element=a[a.length-1];
		for(int i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=element;
		return a;
	}

}
