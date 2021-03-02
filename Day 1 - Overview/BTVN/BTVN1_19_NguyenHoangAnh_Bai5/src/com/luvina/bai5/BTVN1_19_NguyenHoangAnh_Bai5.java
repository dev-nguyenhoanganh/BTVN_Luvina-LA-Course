/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai5
 */
package com.luvina.bai5;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 26 thg 2, 2021
 * @version 1.0
 */
public class BTVN1_19_NguyenHoangAnh_Bai5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1, 8, 5, 7, 3, 11, 6, 1, 11, 5};
		
		System.out.println("Mảng ban đầu : "
						  + Arrays.toString(arr));
		
		if(replaceMaxAndMin(arr)) {
			System.out.println("Mảng sau khi đổi giá trị : "
							  + Arrays.toString(arr));
		}
	}
	
	// --------------------- Private Layer ---------------------
	
	/**
	 * @param arr
	 */
	private static boolean replaceMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		// Tìm max - min
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) 
				min = arr[i];
			if (max < arr[i]) 
				max = arr[i];
		}
		
		if (max == min) {
			System.out.println("Các phần tử trong mảng bằng nhau");
			return false;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == max) 
				arr[i] = min;
			else if(arr[i] == min)
				arr[i] = max;
		}
		return true;
	}
}
