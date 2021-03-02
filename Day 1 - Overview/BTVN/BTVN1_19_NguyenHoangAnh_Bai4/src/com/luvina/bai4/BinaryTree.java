/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai4
 */
package com.luvina.bai4;

/**
 * @author Hoang Anh
 * @since 25 thg 2, 2021
 * @version 1.0
 */
public class BinaryTree {
	Node root;
	
	/**
	 * 
	 */
	public BinaryTree() {
		root = null;
	}
	
	public Node insertRec(Node newNode, int value) {
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		if(value < root.value)
			root.left = insertRec(root.left, value);
		else if(value > root.value)
			root.right = insertRec(root.right, value);
		
		return root;
	}

	public void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.value);
			inorderRec(root.right);
		}
	}
	
	public Node search(Node root, int value) {
		// Trường hợp gốc : nếu node null hoặc là node root
		if(root == null || root.value == value) {
			return root;
		}
		
		// Giá trị lớn hơn giá trị code node root 
		if(root.value > value) {
			return search(root.left, value);
		}
		
		// giá trị bé hơn giá trị của node root 
		return search(root.right, value);
	}
	
}
