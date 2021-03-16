/**
 * @Project_Name 19_NguyenHoangAnh_Bai5
 */
package com.luvina.bai56;

import java.util.SortedSet;
import java.util.TreeSet;

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
		System.out.println("               Bài 8                 ");
		
		TreeSet<Integer> setNumber = new TreeSet<>();
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
		System.out.println("               Bài 9                 ");
		
		SortedSet<Student> set = new TreeSet<>();
		
		Student student1 = new Student("[1] Hoàng Anh" , "A" , 20);
		Student student2 = new Student("[2] Hồng Quang", "B+", 25);
		Student student3 = new Student("[3] Toàn Phong", "C-", 21);
		Student student4 = new Student("[4] Trung Quân", "C-", 21);
		Student student5 = new Student("[1] Hoàng Anh" , "A" , 20);
		
		set.add(student1);
		set.add(student2);
		set.add(student3);
		
		// False vì tuổi bằng nhau 
		// Mà compareTo() so sánh 2 tuổi với nhau
		System.out.println(set.add(student4));
		
		printlist(set);
		
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

	public static void printlist(SortedSet<?> set) {
		System.out.println("\nDanh sách (Đã sắp xếp)");
		for (Object object : set) {
			System.out.println(object.toString());
		}
		System.out.println();
	}
}
