package com.ait.hema;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateElements {
	public static void removeDuplicateElements(String[] a) {
		Set s= new HashSet<>();
		for(String element:a) {
			s.add(element);
		}
            
  System.out.println("the elements are:"+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]array;
		int count;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the elements:");
		count=s.nextInt();
		array= new String[count];
		
		for(int i=0;i<count;i++) {
			System.out.println("Enter the String"+(i+1)+" :");
			array[i]=s.next();
			
		}
		removeDuplicateElements(array);
		

	}

}
