/**
 * @Project_Name BTVN2_19_NguyenHoangAnh_Bai2
 */
package com.luvina.bai2;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 4 thg 3, 2021
 * @version 1.0
 */
public class BTVN2_19_NguyenHoangAnh_Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Câu 2.1
		int[] arr = {1, 3, 4, 5, 6, 8};
		System.out.println("Mảng ban đầu : " + Arrays.toString(arr));
		if(isAscendingOrder(arr)) 
			System.out.println("Là chuỗi tăng dần\n");
		else 
			System.out.println("Không phải chuỗi tăng dần\n");
		
		// Câu 2.2
		int[] list = {1, -1, 1, -1, 1, -1, 1};
		System.out.println("Mảng ban đầu : " + Arrays.toString(list));
		if(isInterleave(list)) 
			System.out.println("Là mảng đan dấu");
		else 
			System.out.println("Không phải mảng đan dấu");
	}
	
	// Method 2.1
	public static boolean isAscendingOrder(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) 
				return false;
		}
		
		return true;
	}

	// Method 2.2
	public static boolean isInterleave(int[] arr) {
		if(arr.length < 2) return true;
		if(arr[0] * arr[1] >= 0) return false;

		// Duyệt vị trí chẵn
		int temp = arr[0];
		for (int i = 2; i < arr.length; i += 2) {
			if(temp * arr[i] <= 0) return false;
		}
		
		// Duyệt vị trí lẻ
		temp = arr[1];
		for (int i = 3; i < arr.length; i += 2) {
			if(temp * arr[i] <= 0) return false;
		}
		
		return true;
	}
}
