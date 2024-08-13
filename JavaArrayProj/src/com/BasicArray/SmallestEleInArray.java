package com.BasicArray;

public class SmallestEleInArray {

	public static void main(String[] args) {
		int[] a1= {5,8,9,2,3,6};
		int minIndex = 0;
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i]<a1[minIndex])
			{
				minIndex=i;
			}
		}
		System.out.println("Smallest element="+a1[minIndex]);
		System.out.println("Smallest element exist index="+minIndex);
	}

}
