/**
 * @Project_Name 19_NguyenHoangAnh_Bai1
 */
package com.luvina.linklist;

/**
 * @author Hoang Anh
 * @since 11 thg 3, 2021
 * @version 1.0
 */
public class Node<Type> {
	Type value;
	Node<?> next;
	
	public Node(Type value) {
		this(value, null);
	}
	
	public Node(Type value, Node<?> next) {
		this.value = value;
		this.next  = next;
	}

	public Type getValue() {
		return value;
	}

	public Node<?> getNext() {
		return next;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Node<?>)
			if ( ((Node<?>) other).value.equals(value) )
				return true;
		return false;
	}
}
