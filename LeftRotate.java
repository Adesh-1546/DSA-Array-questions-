package com.Arrays.RotateElements;
/*
 * Given an array ARR[] with n size , Rotate the array to the left by once means shift all the elements by
 * one place to left and 1st element as last position in array.
 */

import java.util.Scanner;
import java.util.Arrays; 

public class LeftRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int [size] ;
		System.out.println("Enter array elements :");
		for ( int i = 0 ; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("entered array : "+Arrays.toString(arr));
		System.out.println("------------------------------");
		
		// Optimal solution : 
		   // step 1 : declare temporary variable to store 1st element of array.
		   // step 2 : Traverse with [size - 1] and 1st element = 1nd element.
		   // step 3 : then put the last element at the last.
		
		int temp = arr[0];
		for ( int i = 0 ; i < size - 1  ; i++) {
			arr[i] = arr [i+1] ; 
		}
		arr[size-1] = temp;
		
		System.out.println("Array after left rotate : ");
		for ( int i = 0 ; i < size ; i++ ) {
			System.out.print(arr[i]+ " ");
		}
		sc.close();
	}

}
