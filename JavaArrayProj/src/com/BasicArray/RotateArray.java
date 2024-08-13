package com.BasicArray;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		rotate(a);
		System.out.println(Arrays.toString(a));
	}
 static int[] rotate(int[] a)
 {
	 int ele=a[a.length-1];
	 for(int i=a.length-2;i>=0;i--)
	 {
		a[i+1]=a[i]; 
	 }
	 a[0]=ele;
	 return a;
 }
}
