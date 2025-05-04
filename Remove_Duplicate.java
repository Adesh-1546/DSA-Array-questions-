package com.Arrays.SearchElements;
/*
 * Given an sorted array A with n size. Remove Duplicate elements from array such that each element appears 
 * only once. 
 * Also return the length of this array.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Remove_Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter Array elements : ");
		for ( int i = 0 ; i < size ; i++ ) {
			arr [i] = sc.nextInt();
		}
		System.out.println("Entered array : "+Arrays.toString(arr));
		System.out.println("---------------------------------");
		
		// Close Optimal solution : 
		     // step 1 : Sort the array if not sorted
		     // step 2 : declare count to store unique element count
		     // step 3 : Traverse and if 1st element = 2nd element then arr[count++] = arr[i] ; 
		     // step 4 : and last element will be always unique so arr[count++] = arr[size - 1] ;
		     // step 5 : display.
		Arrays.sort(arr);
		
		int count = 0 ;
		for (int i = 0 ; i < size - 1 ; i++) {
			if (arr[i] != arr[i+1]) {
				arr[count++] = arr[i] ; 
			}
		}
		arr[count++] = arr[size - 1] ;
		
		//for print count of unique element
		System.out.print("Unique element count : " + count);
		
		//for printing unique element from array
		System.out.println("Unique element array : ");
		for (int i = 0 ; i < count ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		sc.close();
		
	}

}
