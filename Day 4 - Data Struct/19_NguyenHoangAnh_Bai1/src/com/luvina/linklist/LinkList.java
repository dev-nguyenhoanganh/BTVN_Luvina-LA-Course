/**
 * @Project_Name 19_NguyenHoangAnh_Bai1
 */
package com.luvina.linklist;

/**
 * @author Hoang Anh
 * @since 11 thg 3, 2021
 * @version 1.0
 */
public class LinkList<T> {
	Node<?> first;
	Node<?> last;
	
	/**
	 * 
	 * @param value
	 */
	public LinkList(T value) {
		first = last = new Node<T>(value);
	}
	
	/**
	 * 
	 */
	public LinkList() {
		first = last = null;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * 
	 * @param value
	 */
	public void insertTop(T value) {
		if(isEmpty()) 
			first = last = new Node<T>(value);
		else 
			first = new Node<T>(value, first);
	}
	
	/**
	 * 
	 * @param value
	 */
	public void insertBottom(T value) {
		if(isEmpty()) 
			first = last = new Node<T>(value);
		else {
			last.next = new Node<T>(value);
			last      = last.next;
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public Node<?> search(T value) {
		if(isEmpty()) return null;
		
		Node<?> current = first;
		while (!current.value.equals(value)) {
			current = current.next;
		}
		return current;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public Node<?> searchPrevious(T value) {
		if(isEmpty()) return null;
		
		Node<?> previous = first;
		
		while(!previous.next.getValue().equals(value)) {
			previous = previous.next;
		}
		return previous;
	}
	
	/**
	 * 
	 * @param value
	 */
	public boolean remove(T value) {
		if(isEmpty()) return false;
		
		Node<?> current = search(value);
		if(current == null) return false;

		if(current == first) {
			first = first.next;
			System.gc();
		} else {
			Node<?> preNode = searchPrevious(value);
			preNode.next = current.next;
			System.gc();
		}
		return true;
	}
	
	/**
	 * 
	 */
	public void clear() {
		first = last = null;
		System.gc();
	}
	
	public void printList() {
		if(isEmpty()) {
			System.out.println("Danh sách rỗng");
			return;
		}
		
		Node<?> temp = first;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.print("\n");
	}
}
