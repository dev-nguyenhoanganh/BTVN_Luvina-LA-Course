/**
 * @Project_Name BTVN2_19_NguyenHoangAnh_Bai3
 */
package com.luvina.bai3;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 9 thg 3, 2021
 * @version 1.0
 */
public class BTVN2_19_NguyenHoangAnh_Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, -1, 3, 11, 0, 3, 2, 1, 11};
		System.out.println("Mảng ban đầu: \n" + Arrays.toString(arr));
//		selectionSort(arr);
//		insertionSort(arr, arr.length);
		bubbleSort(arr);
		System.out.println("\n" + Arrays.toString(arr));
		
	}

	// SX-AM01
	public static void selectionSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp   = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	// SX2-AM01
	public static void insertionSort(int[] arr, int length) {
		if(length <= 1) return;
		
		insertionSort(arr, length - 1);
		int last = arr[length - 1];
		int j = length - 2;
		
		while (j >= 0 && arr[j] > last) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
	}
	
	// SX3-AM01
	public static void bubbleSort(int[] arr) {
		int length = arr.length; 
		for (int i = length - 2; i >= 0; i--) {
			for (int j = length - i - 2; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) { 
					int temp = arr[j]; 
					arr[j]   = arr[j + 1]; 
					arr[j+1] = temp; 
				} 
			}
		}	
	}
	
}
