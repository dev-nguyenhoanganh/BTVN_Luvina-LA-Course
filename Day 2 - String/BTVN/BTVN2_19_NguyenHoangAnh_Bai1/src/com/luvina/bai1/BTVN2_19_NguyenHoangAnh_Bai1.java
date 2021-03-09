/**
 * @Project_Name BTVN2_19_NguyenHoangAnh_Bai1
 */
package com.luvina.bai1;

/**
 * @author Hoang Anh
 * @since 4 thg 3, 2021
 * @version 1.0
 */
public class BTVN2_19_NguyenHoangAnh_Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 4;
		
		if(isPrimeNumber(number)) 
			System.out.println("Là số nguyên tố");
		else 
			System.out.println("Không phải số nguyên tố");
	}

	public static boolean isPrimeNumber(int number) {
		if (number < 2)
			return false;
		else if (number == 2 || number == 3)
			return true;
		
		for (int i = 2; i <= number / 2; i++) {
			if(number % i == 0) 
				return false;
		}
		return true;
	}
}
