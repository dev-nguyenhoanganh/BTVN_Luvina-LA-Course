/**
 * @Project_Name 19_NguyenHoangAnh_Bai34
 */
package com.luvina;

import java.util.ArrayList;
import java.util.Comparator;

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
		ArrayList<Double> list = new ArrayList<Double>();
		
		list.add(10.0);
		list.add(9.5);
		list.add(7.5);
		list.add(8.5);
		printList(list);
		
		System.out.println(list.indexOf(9.5));
		list.sort(increase);
		printList(list);
		
		
		System.out.println("\n=============================\n");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Student student1 = new Student("[1] Hoàng Anh" , "A" , 20);
		Student student2 = new Student("[2] Hồng Quang", "B+", 25);
		Student student3 = new Student("[3] Toàn Phong", "C-", 21);
		Student student4 = new Student("[4] Trung Quân", "C-", 21);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		printList(studentList);
		
		if(studentList.remove(student3)) 
			System.out.println("Xóa thành công");
		else 
			System.out.println("Xóa không thành công");
		
		printList(studentList);
		studentList.clear();
		if(studentList.remove(student4)) 
			System.out.println("Xóa thành công");
		else 
			System.out.println("Xóa không thành công");
		printList(studentList);
	}

	public static Comparator<Double> increase = new Comparator<Double>() {

		@Override
		public int compare(Double o1, Double o2) {
			double result = o1 - o2;
			if(result > 0) return 1;
			if(result < 0) return -1;
			return 0;
		}
	};
	
	public static void printList(ArrayList<?> list) {
		for (Object object : list) {
			System.out.println(object.toString());
		}
		System.out.println("\n");
	}
}
