/**
 * @Project_Name BTVN2_19_NguyenHoangAnh_Bai5
 */
package com.luvina.bai5;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 9 thg 3, 2021
 * @version 1.0
 */
public class BTVN2_19_NguyenHoangAnh_Bai5 {

	public static void main(String[] args) {
		int[] arr = {1, 2, -1, 3, -1, 5, 7, 6, 3};
		System.out.println("Mảng ban đầu: \n" + Arrays.toString(arr));
		
		sort(arr);
		System.out.println("\n" + Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		int temp, index;
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			temp  = arr[i];
			if (temp <= 0) continue;
			
			for (int j = i; j < arr.length; j++) {
				if (arr[j] <= 0) continue;
				if (arr[j] < temp) {
					index  = j;
				}
			}
			temp       = arr[index];
			arr[index] = arr[i];
			arr[i] 	   = temp;
		}
	}
}
