package com.BasicArray;

import java.util.Scanner;

public class SmallestEleBydynamic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:-");
		int size=sc.nextInt();
		int[] a1=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Enter the element:-"+"In index-"+i+"=" );
			a1[i]=sc.nextInt();
		}
		int minIndex=0;
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i]<a1[minIndex])
			{
				minIndex=i;
			}
		}
		System.out.println("Smallest element="+a1[minIndex]);
		System.out.println("Smallest index Exist Index="+minIndex);

	}

}
