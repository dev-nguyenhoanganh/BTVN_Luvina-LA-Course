/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai4
 */
package com.luvina.bai4;

/**
 * @author Hoang Anh
 * @since 25 thg 2, 2021
 * @version 1.0
 */
public class Node {
	int value;
	Node left, right;
	
	public Node(int item) {
		value = item;
		left = right = null;
	}
}