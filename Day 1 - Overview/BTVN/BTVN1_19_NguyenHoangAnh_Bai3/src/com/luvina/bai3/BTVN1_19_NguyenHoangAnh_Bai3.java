/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai3
 */
package com.luvina.bai3;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 25 thg 2, 2021
 * @version 1.0
 */
public class BTVN1_19_NguyenHoangAnh_Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {4, 6, 9, 10, 17, 22};
		
		insertNumber(arr, 15);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertNumber(int[] arr, int number) {
		arr[arr.length - 1] = number;
		for (int i = arr.length - 1; i > 0; i--) {
			if(arr[i] < arr[i - 1]) {
				arr[i] = arr[i - 1];
				arr[i - 1] = number;
			}
		}
	}
}
