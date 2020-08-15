package com.ait.hema;

import java.util.Arrays;

public class PairElements {
	public static void sumOfPairElements(Integer []a) {
		Arrays.sort(a);
		int i=0,j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]==16) {
				System.out.println("pair elements:"+a[i]);
			    System.out.println("pair elements:"+a[j]);
			}
			else if(a[i]+a[j]<16)
				i++;
			
			else
				j--;
		}
		
		
	}

	public static void main(String[] args) {
		PairElements pe= new PairElements();
		Integer a[]={3, 6, 8, -8, 10, 8 };
		
		System.out.println("pairElemants:");
		pe.sumOfPairElements(a);

	}

}
