package com.ait.hema;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinDifferance {
	public static void diffBetweenMinMax(Integer[] a,int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++)
				if(a[i].compareTo(a[j])>0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			
				}
		}	
		System.out.println("sorted elements:"+Arrays.toString(a));
		System.out.println("the largest number::"+a[len-1]);
		System.out.println("the smallest number::"+a[0]);
		System.out.println("diff between max and min"+(a[len-1]-a[0]));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array;
		int count;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements:");
		count=sc.nextInt();
		array=new Integer[count];
		for(int i=0;i<count;i++)
			array[i]=Integer.parseInt(sc.next());
		diffBetweenMinMax(array, count);


	}


}
