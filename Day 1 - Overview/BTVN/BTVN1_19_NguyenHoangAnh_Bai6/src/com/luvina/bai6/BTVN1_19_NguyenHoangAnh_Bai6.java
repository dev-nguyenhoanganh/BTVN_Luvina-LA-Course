/**
 * @Project_Name BTVN1_19_NguyenHoangAnh_Bai6
 */
package com.luvina.bai6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Hoang Anh
 * @since 2 thg 3, 2021
 * @version 1.0
 */
public class BTVN1_19_NguyenHoangAnh_Bai6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    String name = "   Michael       Jackson    		     ";
	    String nameStudent = "Bình";
	    String listStudent[] = {
	            "Hoàng Trung Quân",
	            "Nguyễn Viết Bình",
	            "Tạ Quang Thắng",
	            "Trần Bình Trọng",
	            "Nguyễn Hoàng Anh",
	            "Đỗ Văn An",
	            "Đinh Văn Bình",
	            "Nguyễn Trần Bình",
	            "Tạ Đình Huy" };
	    
	    System.out.println("Câu 1) Tên trước khi chuẩn hóa: \n" + name);
		
	    name = trim(name);
	    System.out.println("\nTên sau khi chuẩn hóa: \n" + name);
		
	    System.out.println("\nCâu 2) Tách tên thành Họ, Tên đệm, Tên : ");
	    String[] result = splitName(name);
	    System.out.println( "Họ      : " + result[0] + "\n"
                + "Tên đệm : " + result[1] + "\n"
                + "Tên     : " + result[2]);
	    
	    String arr[] = findLongest(" a bb ccc dddd eeee");
	    System.out.println("\nCâu 3) Tìm từ dài nhất : \n" 
	                      + Arrays.toString(arr));
	    
	    arr = findByName(listStudent, nameStudent);
	    System.out.println("\nCâu 4) Tìm sinh viên theo tên : \""
	                     + nameStudent + "\"" + "\n"
	                     + Arrays.toString(arr));
	    
	    System.out.println("\nCâu 5) Sắp xếp danh sách học sinh : ");
	    orderByName(listStudent);
	}

	// --------------------- Method 1 ---------------------
	
	/**
	 * Loại bỏ khoảng trắng thừa có trong String
	 * @param name
	 * @return
	 */
	public static String trim(String name) {
		String result = "";
		result = name.trim();
		
		while(result.contains("  ") || result.contains("\t")) {
			result = result.replaceAll("  ", " ");
			result = result.replaceAll("\t", "");
		}
		return result;
	}
	
	// --------------------- Method 2 ---------------------
	
	/**
	 * Tách tên thành Họ, Tên đệm, Tên
	 * @param name
	 * @return
	 * 	result[0] - Họ <br>
	 * 	result[1] - Tên đệm <br>
	 * 	result[2] - Tên
	 */
	public static String[] splitName(String name) {
		if (name.contains(" ")) {
			String result[] = new String[3];
			
			int beginIndex = name.indexOf(" ");
			int lastIndex = name.lastIndexOf(" ");
			
			if (lastIndex > beginIndex)
				result[1] = name.substring(beginIndex + 1, lastIndex);
			else
				result[1] = "Không có";
			
			result[0] = name.substring(0, beginIndex);
			result[2] = name.substring(lastIndex + 1);
			return result;
		} 
		System.err.println("Tên không đúng định dạng\n"
		                +  "Họ và tên cần được cách nhau "
		                +  "bởi ký tự khoảng trắng ' '");
		return null;
	}
	
	// --------------------- Method 3 ---------------------
	
	/**
	 * Tìm từ có độ dài lớn nhất
	 * @param str
	 * @return
	 */
	public static String[] findLongest(String str) {
	    int arrLength = 1;
	    String[] result = str.split(" ");
	    Arrays.sort(result);
	    
	    for (int i = arrLength - 1; i > 1; i++) {
	        if(result[i].length() > result[i - 1].length())
	            break;
	        if(result[i] == result[i - 1])
	            arrLength++;
	    }
	    
	    return Arrays.copyOfRange(result, 
	                              result.length - arrLength - 1, 
	                              result.length);
	}
	
	// --------------------- Method 4 ---------------------
	
	/**
	 * Tìm sinh viên theo tên
	 * @param listStudent
	 * @param name
	 * @return
	 */
	public static String[] findByName(String[] listStudent, String name) {
		int index = 0;
		String[] result = new String[listStudent.length];
		
		for (int i = 0; i < listStudent.length; i++) {
			if(listStudent[i].contains(name)) {
				result[index++] = listStudent[i];
			}
		}
		if(index == 0)
			return null;

		return Arrays.copyOf(result, index);
	}
	
	// --------------------- Method 5 ---------------------
	
	/**
	 * Xếp danh sách sinh viên theo Tên -> Đệm -> Họ
	 * @param arr
	 */
	public static void orderByName(String[] arr) {
		String[][] listName = new String[arr.length][3];
		for (int i = 0; i < arr.length; i++) {
			listName[i] = splitName(arr[i]);
		}
		
		Arrays.sort(listName, alphabetOrder);
		
		// In kết quả
		for (int i = 0; i < listName.length; i++) {
			System.out.print("\n" + (i + 1) + ") ");
			for (int j = 0; j < 3; j++) {
				System.out.print(listName[i][j] + " ");
			}
			
		}
	}
	
	static Comparator<String[]> alphabetOrder = new Comparator<String[]>() {

		@Override
		public int compare(String[] o1, String[] o2) {
			int result = o1[2].compareTo(o2[2]); 
			if(result == 0) {
				result = o1[1].compareTo(o2[1]);
				if (result == 0)
					return o1[0].compareTo(o2[0]);
			}
			return result;
		}
	};
}
