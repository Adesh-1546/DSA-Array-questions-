package com.Arrays.RotateElements;

import java.util.Scanner;
import java.util.Arrays;


public class LeftShift_byNplace {
	
	//left shift method 
	public void leftShift(int arr[], int size, int n) {
		 n = n % size; // Handle n > size
	        
	        int[] temp = new int[n];
	        
	        // Step 1: Copy first n elements to temp
	        for (int i = 0; i < n; i++) {
	            temp[i] = arr[i];
	        }
	        
	        // Step 2: Shift remaining elements to the left
	        for (int i = n; i < size; i++) {
	            arr[i - n] = arr[i];
	        }
	        
	        // Step 3: Copy temp back to the end
	        for (int i = 0; i < n; i++) {
	            arr[size - n + i] = temp[i];
	        }
	        
		
	}
	
	public void display(int arr[],int size) {
		for (int i = 0 ; i < size ; i++)
			System.out.print(arr[i] + " ");
	}
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter array elements : ");
		for ( int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered array is : "+Arrays.toString(arr));
		
		LeftShift_byNplace l = new LeftShift_byNplace();
		
		System.out.println("Enter left shift number : ");
		int n = sc.nextInt();
		//left shift method 
		l.leftShift(arr, size, n);
		
		//display
		l.display(arr,size);
		
		
		
		
		sc.close();
		
		
	}

}
