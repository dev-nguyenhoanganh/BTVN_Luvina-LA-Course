/**
 * @Project_Name BTVN2_19_NguyenHoangAnh_Bai6
 */
package com.luvina.bai6;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 9 thg 3, 2021
 * @version 1.0
 */
public class BTVN2_19_NguyenHoangAnh_Bai6 {
	public static void main(String[] args) {
		int[] arr = {1, 2, -1, 3, -3, -5, 7, -2, 2};
		System.out.println("Mảng ban đầu: \n" + Arrays.toString(arr));
		
		sort(arr);
		System.out.println("\n" + Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				for (int j = i; j < arr.length; j++) {
					if (arr[j] >= 0) continue;
					if (arr[j] > arr[i]) {
						temp   = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			else 
				for (int j = i; j < arr.length; j++) {
					if (arr[j] < 0) continue;
					if (arr[j] < arr[i]) {
						temp   = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
		}
	}
}
