package com.ait.hema;

import java.util.Arrays;

public class SmallestPairelements {
public static void pairElementsSum(Integer []a) {
		
		Arrays.sort(a);
		int i=0,j=1;
		if(i<a.length && j<a.length) {
			System.out.println(a[i]+a[j]);
		}
		
	}
	public static void main(String[] args) {
		SmallestPairelements spe=new SmallestPairelements();
		Integer []a={5, 6,8,2,3, 3, 7};
		System.out.println("the smallest pairsum");
		spe.pairElementsSum(a);
	}

}
