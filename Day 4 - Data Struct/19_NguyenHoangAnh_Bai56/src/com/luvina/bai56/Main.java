/**
 * @Project_Name 19_NguyenHoangAnh_Bai5
 */
package com.luvina.bai56;

import java.util.PriorityQueue;

/**
 * @author Hoang Anh
 * @since 15 thg 3, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Student> studentList = new PriorityQueue<Student>();
		
		Student student1 = new Student("[1] Hoàng Anh" , "A" , 20);
		Student student2 = new Student("[2] Hồng Quang", "B+", 25);
		Student student3 = new Student("[3] Toàn Phong", "C-", 21);
		Student student4 = new Student("[4] Trung Quân", "C-", 21);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		printlist(studentList);
		
		System.out.println("-----------------------");
		// Print top of queue
		System.out.println(studentList.peek());
		
		System.out.println("-----------------------");
		// Print top and remove it
		System.out.println(studentList.poll());
		
		System.out.println("-----------------------");
		// Print top of queue
		System.out.println(studentList.peek());
	}

	public static void printlist(PriorityQueue<?> list) {
		for (Object object : list) {
			System.out.println(object.toString());
		}
	}
}
