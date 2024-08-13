package com.BasicArray;
import java.util.Scanner;
public class DynamicBiggestElem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:-");
		int size=sc.nextInt();
		int[] b=new int[size];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the array element:-"+"In index-"+i+"=");
			b[i]=sc.nextInt();
		}
		for(int n:b) {
			System.out.print("Array elements are="+n+" ");
		}
		System.out.println();
		int maxIndex=0;
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>b[maxIndex]) {
				maxIndex=i;
			}
		}
		System.out.println("Biggest element="+b[maxIndex]);
		System.out.println("Biggest element exist in index="+maxIndex);
	}

}
