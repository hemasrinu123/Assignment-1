package com.ait.hema;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestNumber {
	public static void thirdLargestNumber(Integer[] a,int len) {
		if(len>=3) {
			for(int i=0;i<len-1;i++) {
				for(int j=i+1;j<len;j++)
					if(a[i].compareTo(a[j])>0) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				
					}
			}	
			System.out.println("sorted elements:"+Arrays.toString(a));
			System.out.println("third largest number::"+a[len-3]);
			
		}
		else
			System.out.println("the third largest number doesnot exit");
		
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
		thirdLargestNumber(array, count);

	}

}
