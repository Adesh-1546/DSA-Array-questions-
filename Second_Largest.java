package com.Arrays.SearchElements;

/* Problem Statement : 
    Given an array A[] of N unique non-negative integer and is asked to find Second largest and
    second smallest element of array.
    Your task is to Return 2 elements as another array of size 2 . 
 */

import java.util.Scanner;
import java.util.Arrays;


public class Second_Largest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		//input
		int A[] = new int [size];
		System.out.println("Enter Array elements : ");
		for (int i = 0 ; i < size ; i++ ) {
			A[i] = sc.nextInt();
		}
		//display
		System.out.println("Entered array is : "+Arrays.toString(A));
		
		System.out.println("----------------------");
		
		//Second Largest an smallest :
		//method 1 : brute force solution
		     // step 1 : Sort the array in ascending order 
	         // step 2 : print second last array element for large number .  [arr.length-2]
		     // step 3 : print second  array element for Small number .  a[1]
		Arrays.sort(A);
		System.out.println("Brute Force Solution : ");
		System.out.println("Second largest Number in array is : "+A[A.length-2]);
		System.out.println("Second Smallest Number in array is : "+A[1]);
		
		System.out.println("----------------------");
		
		
		
		//method 2 : optimal solution
		    // step 1 : Declare a variable largest and smallest and store 1st element of array
		    // step 2 : Traverse each element of array and if element > largest then largest = new element
		    // step 3 : Traverse each element of array and if element < smallest then smallest = new element
		
		//Second largest
		int largest = A[0];
		int slargest = A[0];
		for (int i = 0 ; i < size ; i++ ) {
			if (A[i] > largest) {
				slargest = largest ;
				largest = A[i];
			}else if (A[i] < largest  && A[i] > slargest ) {
				slargest = A[i];
			}
		}
		
		//Second Smallest 
		int smallest = A[0];
		int ssmallest = A[0];
		for (int i = 0 ; i < size ; i++ ) {
			if (A[i] < smallest ) {
				ssmallest = smallest ; 
				smallest = A[i];
			}else if (A[i] > smallest && A[i] < ssmallest) {
				ssmallest = A[i];
			}
		}
		
		
		int A1 [] = new int [2] ; 
		A1[0] = slargest ; 
		A1[1] = ssmallest ; 
		System.out.println("Optimal solution : ");
		System.out.println("Second Largest : "+slargest);
		System.out.println("Second smallest : "+ssmallest);
		System.out.println(Arrays.toString(A1));
		
		sc.close();
}
}

