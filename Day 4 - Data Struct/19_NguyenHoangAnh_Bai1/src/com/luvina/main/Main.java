/**
 * @Project_Name 19_NguyenHoangAnh_Bai1
 */
package com.luvina.main;

import com.luvina.linklist.LinkList;
import com.luvina.object.Student;

/**
 * @author Hoang Anh
 * @since 11 thg 3, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkList<String> list = new LinkList<String>(); 
		String item = "4. Thêm vào dưới";
		
		list.insertBottom("1. Thêm vào dưới");
		list.insertTop   ("2. Thêm vào trên");
		list.insertTop   ("3. Thêm vào trên");
		list.insertBottom("4. Thêm vào dưới");
		list.printList();
		
		if(list.remove(item)) 
			System.out.println("Xóa thành công");
		else 
			System.out.println("Xóa không thành công");
		
		list.printList();
		list.clear();
		if(list.remove(item)) 
			System.out.println("Xóa thành công");
		else 
			System.out.println("Xóa không thành công");
		list.printList();
		
		
		LinkList<Student> studentList = new LinkList<Student>(); 
		
		System.err.println("\n=================================\n");
		
		Student student1 = new Student("[1] Hoàng Anh" , "A" , 20);
		Student student2 = new Student("[2] Hồng Quang", "B+", 25);
		Student student3 = new Student("[3] Toàn Phong", "C-", 21);
		Student student4 = new Student("[4] Trung Quân", "C-", 21);
		
		studentList.insertBottom(student1);
		studentList.insertTop   (student2);
		studentList.insertTop   (student3);
		studentList.insertBottom(student4);
		studentList.printList();
		
		if(studentList.remove(student4)) 
			System.out.println("Xóa thành công");
		else 
			System.out.println("Xóa không thành công");
		
		studentList.printList();
		studentList.clear();
		if(studentList.remove(student4)) 
			System.out.println("Xóa thành công");
		else 
			System.out.println("Xóa không thành công");
		studentList.printList();
	}

}
