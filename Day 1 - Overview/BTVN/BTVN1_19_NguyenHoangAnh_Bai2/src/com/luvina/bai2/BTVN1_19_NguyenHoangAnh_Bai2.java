/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai2
 */
package com.luvina.bai2;

import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 25 thg 2, 2021
 * @version 1.0
 */
public class BTVN1_19_NguyenHoangAnh_Bai2 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr = {8, 6, 7, 3, 5, 6, 8, 9, 1, 4, 6, 7, 8, 1};
		System.out.println("Mảng ban đầu : ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\nKết quả tìm được : ");
		findList(arr);
	}

	/**
	 * 
	 * @param arr
	 */
	public static void findList(int arr[]) {
		int[][] bufferIndex = findLength(arr);
		int max[] = findMaxLength(bufferIndex);
		
		if(max[1] != 0) {
			System.out.println("Số đoạn = " + max[1]);
		}
		
		System.out.println("Độ dài của đoạn = " + max[0]);
		System.out.print("{");
		
		for (int i = 0; i < bufferIndex[0].length; i++) {
			if(bufferIndex[0][i] == -1) {
				break;
			}
			
			if(bufferIndex[1][i] == max[0]) {
				System.out.print("[đầu = " 
								+ bufferIndex[0][i]
								+ ", cuối = "
								+ (bufferIndex[0][i] + max[0] - 1)
								+ "]");
				
				if(--max[1] == 0) {
					System.out.print("}");
				} else {
					System.out.print("; ");
				}
			}
		}	
	}
	
	// --------------------- Private Layer ---------------------
	
	/**
	 * Trả về mảng 2 chiều, trong đó:
	 * - Chiều 1 : Chứa vị trí bắt đầu của dãy
	 * - Chiều 2 : Chứa kích thước của dãy tăng dần
	 * 
	 * @param arr
	 * @return
	 *    bufferLength[Vị trí][Kích thước]
	 */
	private static int[][] findLength(int arr[]) {
		int bufferIndex[][] = new int[2][arr.length];
		int tempNumber = arr[0];
		int count = 1;
		int index = 0;

		Arrays.fill(bufferIndex[0], -1);
		bufferIndex[0][0] = 0;

		// Duyệt mảng
		for (int i = 1; i < arr.length; i++) {
			if(tempNumber < arr[i]) {
				count++;
			} else {
				bufferIndex[1][index++] = count;
				if(index != 0) {
					bufferIndex[0][index] = i;
				}
				tempNumber = arr[i];
				count = 1;
			}

			if(i == arr.length - 1) {
				bufferIndex[1][index] = count;
			}
		}
		
		return bufferIndex;
	}
	
	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	/**
	 * Tìm và trả về độ dài lớn nhất trong mảng vị trí
	 * <br>
	 * 
	 * @param bufferIndex
	 * @return
	 * max[0] : Giá trị lớn nhất <br>
	 * max[1] : Số lần xuất hiện
	 */
	private static int[] findMaxLength(int[][] bufferIndex) {
		int max[] = new int[2];
		max[0] = bufferIndex[1][0];
		max[1] = 1;
		for (int i = 0; i < bufferIndex[0].length; i++) {
			if(bufferIndex[0][i] == -1) {
				break;
			}
			
			if(max[0] < bufferIndex[1][i]) {
				max[0] = bufferIndex[1][i];
				max[1] = 1;
			} else if(max[0] == bufferIndex[1][i]) {
				max[1]++;
			}
		}
		return max;
	}	
}
