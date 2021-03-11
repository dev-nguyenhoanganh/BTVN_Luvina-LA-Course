/**
 * @Project_Name 19_NguyenHoangAnh_Bai1
 */
package com.luvina.object;

/**
 * @author Hoang Anh
 * @since 11 thg 3, 2021
 * @version 1.0
 */
public class Student {
	String name;
	String score;
	int    age;
	
	public Student() {
		this.name  = null;
		this.score = null;
		this.age   = 0;
	}
	
	public Student(String name, String score, int age) {
		this.name  = name;
		this.score = score;
		this.age   = age;
	}
	
	@Override
	public String toString() {
		return "Tên  : " + this.name  + "\n"
			+  "Điểm : " + this.score + "\n"
			+  "Tuổi : " + this.age   + "\n";
	}
	
	@Override
	public boolean equals(Object other) {
		return this.name.equals( ((Student) other).getName() );
	}
	
	// ---------------------- GETTER ----------------------
	public String getName() {
		return name;
	}

	public String getScore() {
		return score;
	}

	public int getAge() {
		return age;
	}
}
