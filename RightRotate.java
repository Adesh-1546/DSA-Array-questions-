package com.Arrays.RotateElements;

import java.util.Scanner;
import java.util.Arrays;

public class RightRotate {
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
		
		int temp = arr[size - 1 ];
		for ( int i = size - 1 ; i > 0 ; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		System.out.println("Array after left rotate : ");
		for ( int i = 0 ; i < size ; i++ ) {
			System.out.print(arr[i]+ " ");
		}
		sc.close();
		
	}

}
