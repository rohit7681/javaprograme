package Algorithim;

import java.util.Arrays;

public class ShiftAllZeroRight {

	public static void main(String[] args)
	{
		int[] a= {1,2,0,4,0,5,0,3,0,8,0,2,0};
		for(int i=0;i<a.length-1;i++)
		{
			while(i>-1 && (a[i]<a[i+1]))
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp; 
				i--;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
