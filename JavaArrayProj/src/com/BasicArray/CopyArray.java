package com.BasicArray;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int[] b=new int[10];
		System.arraycopy(a,2,b,3,1);
		System.out.println(Arrays.toString(b));
		

	}

}
