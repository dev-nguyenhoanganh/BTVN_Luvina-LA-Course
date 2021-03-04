/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai1
 */
package com.luvina.bai1;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 25 thg 2, 2021
 * @version 1.0
 */
public class BTVN1_19_NguyenHoangAnh_Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {10, 5, 10, 5, 1, 5, 1, 9, 1};
		System.out.println("Mảng ban đầu : +\n" + Arrays.toString(arr));
		
		findMaxArr(arr);
	}
	
	public static void findMaxArr(int[] arr) {
        int max = arr[0];
        int j = 1;
        int bufferIndex[] = new int[arr.length];
        Arrays.fill(bufferIndex, -1);
        bufferIndex[0] = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (max == arr[i]) {
                bufferIndex[j++] = i;
            }
            if(max < arr[i]) {
                max = arr[i];
                j = 0;
                bufferIndex[j++] = i; 
            }
        }
        
        // In kết quả
        System.out.println("Find max Array");
        if(j == arr.length) {
            System.out.println("Các phần tử trong mảng bằng nhau");
        } else if(j == 1) {
        	System.out.println("Giá trị lớn nhất: " + max);
        } else {
            System.out.println("Giá trị lớn nhất: " + max);
            System.out.print("Vị trí : ");
            for (int i = 0; i < j; i++) {
                if(bufferIndex[i] == -1) {
                    break;
                }
                System.out.print(bufferIndex[i]);
                if(bufferIndex[i + 1] != -1)
                    System.out.print(", ");
                else 
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}
