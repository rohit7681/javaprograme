package com.BasicArray;
import java.util.Scanner; 
public class SumofArrayElem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array element:-"+"index-"+i+"=");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int n:arr)
		{
			System.out.print(n+" ");
			sum=sum+n;		
		}
		System.out.println();
		System.out.println("Sum of all the elements="+sum);
	}

}
