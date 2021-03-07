/**
 * @Project_Name BTVN2_19_NguyenHoangAnh_Bai2
 */
package com.luvina.bai2;

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
		int[] arr = {1, 3, 4, 5, 6, 8};
		
		if(ascendingOrder(arr)) {
			
		}
	}
	
	public static boolean ascendingOrder(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) 
				return false;
		}
		
		return true;
	}

}
