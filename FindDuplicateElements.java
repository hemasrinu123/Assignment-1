package com.ait.hema;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElements {
	public static void findDuplicateelements(String[] a) {
		Set<String> set=new HashSet<String>();
		for(String s1: a) {
			if(!set.add(s1)) {
				System.out.println("element:"+s1);
			}
			
		}
	}
	public static void main(String[] args) {
		String[]array;
		int count;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements:");
		count=sc.nextInt();
		array= new String[count];
		for(int i=0;i<count;i++) {
			System.out.println("enter the string:"+(i+1)+":");
			array[i]=sc.next();
			
		}
		System.out.println("all element:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		findDuplicateelements(array);
	}

}
