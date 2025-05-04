package com.Arrays.SearchElements;

//Problem statement
// Given an Array arr[] of size N. Find the largest element in array.

import java.util.Scanner;
import java.util.Arrays;

public class Largest_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		//input
		int arr[] = new int [size];
		System.out.println("Enter Array elements : ");
		for (int i = 0 ; i < size ; i++ ) {
			arr[i] = sc.nextInt();
		}
		//display
		System.out.println("Entered array is : "+Arrays.toString(arr));
		
		System.out.println("----------------------");
		
		
		
		//method 1 : brute force solution 
		     // step 1 : Sort the array in ascending order 
		     // step 2 : print last array element
		
		Arrays.sort(arr);        //array sorted in ascending order
		System.out.println("Largest element from array using brute force : "+arr[arr.length-1]);
		
		System.out.println("----------------------");
		
		
		
		//method 2 : optimal Solution 
		     // step 1 : Declare a variable largest and keep 1st element in largest.
		     // step 2 : Traverse each element and check if that element > largest.
		     // step 3 : if yes ... largest = new element
		
		int largest = arr[0] ; 
		for (int i = 0 ; i < size ; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest element from array using Optimal solution : "+largest);
		
		
		 sc.close();


	}

}
