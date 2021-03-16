/**
 * @Project_Name 19_NguyenHoangAnh_Bai5
 */
package com.luvina.bai56;

import java.util.HashSet;

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
		System.out.println("-------------------------------------");
		System.out.println("               Bài 6                 ");
		
		HashSet<Integer> setNumber = new HashSet<>();
		int num = 10;
		
		setNumber.add(10) ;
		setNumber.add(19) ;
		setNumber.add(15) ;
		setNumber.add(0)  ;
		setNumber.add(-15);
		setNumber.add(num);
		
		System.out.println("Danh sách hiện tại: ");
		printlist(setNumber);

		System.out.println();
		if(!setNumber.add(10)) {
			System.out.println("Thêm không thành công số : " + num);
		}
		
		System.out.println("Xóa số " + num);
		setNumber.remove(num);
		printlist(setNumber);
		
		System.out.println();
		System.out.println("HashCode() : " + setNumber.hashCode());
		
		System.out.println(setNumber.contains(-15));
		
		// =======================================================
		System.out.println("-------------------------------------");
		System.out.println("               Bài 7                 ");
		
		HashSet<Student> set = new HashSet<>();
		
		Student student1 = new Student("[1] Hoàng Anh" , "A" , 20);
		Student student2 = new Student("[2] Hồng Quang", "B+", 25);
		Student student3 = new Student("[3] Toàn Phong", "C-", 21);
		Student student4 = new Student("[4] Trung Quân", "C-", 21);
		Student student5 = new Student("[1] Hoàng Anh" , "A" , 20);
		
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		
		printlist(set);
		
		// Kiểm tra contains là kiểm tra hashCode
		System.out.println("Student 1 - HashCode : " + student1.hashCode());
		System.out.println("Student 5 - HashCode : " + student5.hashCode());
		if( set.contains(student5) ) 
			System.out.println("Tồn tại học sinh này trong danh sách!");
		else 
			System.out.println("Chưa tồn tại học sinh này trong danh sách!");
		
		if(set.add(student5)) 
			System.out.println("Thêm thành công");
		else 
			System.out.println("Thêm thất bại");
		
		printlist(set);
	}

	public static void printlist(HashSet<?> set) {
		for (Object object : set) {
			System.out.println(object.toString());
		}
	}
}
