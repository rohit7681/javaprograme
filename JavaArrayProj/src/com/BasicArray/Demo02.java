package com.BasicArray;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int size=sc.nextInt();
		int[] a1=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Enter the value of index "+i+"=");
			a1[i]=sc.nextInt();
		}
		m1(a1);
		for(int n:a1)
		{
			System.out.println(n);
		}
	}
	static void m1(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]++;
		}
	}

}
