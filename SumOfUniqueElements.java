package com.ait.hema;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfUniqueElements {
	public static void uniqueElementsSum(Integer[] array) {
		int sum=0;
		Set<Integer> s= new HashSet<Integer>();
		for(Integer element:array)
			if(s.add(element))
				sum=sum+element;
				System.out.println("the sum of elemnts:"+sum);
		
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
		uniqueElementsSum(array);

	}
	
}
