/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai4
 */
package com.luvina.bai4;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 25 thg 2, 2021
 * @version 1.0
 */
public class BTVN1_19_NguyenHoangAnh_Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1, 3, 3, 4, 5, 6, 7, 7, 7, 7, 8, 9, 10, 50}; 
		
		find(arr, 3);
	}

	/**
	 * Tìm kiếm và in ra console các vị trí của mảng
	 * có giá trị bằng <b><code>value</code></b> truyền vào
	 * 
	 * @param arr
	 * @param i
	 */
	public static void find(int[] arr, int value) {
		int index = binarySearch(arr, value);
		if(index == -1) {
			System.err.println("Phần tử cần tìm không tồn tại trong mảng");
			return;
		}
		
		int idx[] = searchOtherIndex(arr, index, value);
		System.out.print("Giá trị cần tìm xuất hiện tại vị trí : ");
		for (int i = 0; i < idx.length; i++) {
			if(idx[i] == arr.length) {
				System.out.println(".");
				return;
			} else if(i == 0) {
				System.out.print(idx[i]);
			} else {
				System.out.print(", " + idx[i]);
			}
		}
	}
	
	// --------------------- Private Layer ---------------------

	/**
	 * Trả về vị trí của phần tử trong mảng
	 * @param arr
	 * @param value
	 * @param left
	 * @param right
	 * @return
	 *    
	 */
	private static int binarySearch(int[] arr, int value) {
		int left = 0, right = arr.length - 1;
        while (left <= right) {
        	int m = (right + left) / 2;
        	
            if (arr[m] == value)
                return m; 
            if (arr[m] < value)
                left = m + 1;
            else
                right = m - 1;
        }
        return -1;
	}
	
	/**
	 * Tìm các vị trí còn lại có giá trị bằng value
	 * @param arr
	 * @param index
	 * @param value
	 * @return
	 *     <b><code>idx[]</code></b> - chứa các vị trí 
	 *     các phần tử có giá trị bằng <b>value</b> 
	 */
	private static int[] searchOtherIndex(int[] arr, int index, int value) {
		int idx[] = new int[arr.length];
		int     j     = 0;
		int increase  = 0;
		int tempIndex = 0;
		boolean left  = true;
		boolean right = true;
		
		Arrays.fill(idx, arr.length);
		idx[j++] = index; 
		
		while(left || right) {
			increase++;
			
			if(left) {
				tempIndex = index - increase;
				if (tempIndex > 0) {
					if(value == arr[tempIndex]) 
						idx[j++] = tempIndex;
					else 
						left = false;
				} else {
					left = false;
				}
			}
			
			if(right) {
				tempIndex = index + increase;
				if (tempIndex < arr.length) {
					if(value == arr[tempIndex])
						idx[j++] = tempIndex;
					else
						right = false;
				} else {
					right = false;
				}
			}
		}
		
		Arrays.sort(idx);
		return idx;
	}
	
}
