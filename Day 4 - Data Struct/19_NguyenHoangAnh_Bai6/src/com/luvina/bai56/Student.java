/**
 * @Project_Name 19_NguyenHoangAnh_Bai34
 */
package com.luvina.bai56;

/**
 * @author Hoang Anh
 * @since 11 thg 3, 2021
 * @version 1.0
 */
public class Student implements Comparable<Student> {
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
		Student student = (Student) other;
		boolean name = this.name.equals( student.getName() );
		boolean age  = this.age == student.getAge();
		return name && age;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
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

