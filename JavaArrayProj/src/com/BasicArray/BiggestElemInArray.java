package com.BasicArray;

public class BiggestElemInArray {

	public static void main(String[] args) {
		int a[]= {12,45,78,65,30,33};
		int maxIndex=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[maxIndex]) {
				maxIndex=i;
			}
		}
		System.out.println("Biggest element="+a[maxIndex]);
		System.out.println("Biggest element exist in index="+maxIndex);

	}

}
