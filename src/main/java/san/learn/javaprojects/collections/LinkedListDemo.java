package san.learn.javaprojects.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo<T> {
	
	public Node<T> head;
	
	public LinkedListDemo(){
		
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.getT());
			n = n.next;
		}
	}
	
	public void add(T t) {
		Node<T> n = new Node<>(t);
		if (head == null) {head = n;return;}
		Node tN = head;
		while(tN != null) {
			if(tN.next == null) {
				tN.next = n;
				return;
			}
			tN = tN.next;
		}
	}
	
	
	public void add(int index , T t) {
		Node<T> n = new Node<>(t);
		Node<T> tN = head;
		int i = 0;
		if(index == 0) {
			head = n;
			n.next = tN;
			return;
		}
		while(tN != null) {
			if(i == (index - 1)) {
				Node<T> p = tN;
				Node<T> nN = tN.next;
				p.next = n;
				n.next = nN;
				return;
			}
			tN = tN.next;
			i++;
		}
	}
	
	public Node<T> remove(Node<T> head, int position) {
		Node<T> node = head; 
		int i = 0;
		while((node = node.next) != null  && i++ == (position - 1)) {
			
			
		}
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListDemo<Integer> ld = new LinkedListDemo<Integer>();
		Arrays.asList(1,2,3,4).forEach(e -> ld.add(e));
//		ld.add(3, 5);
		ld.remove(ld.head, 2);
		ld.printList();
	}
}


class Node<T>{
	public Node<T> next;
	T t;
	
	public Node(T t){
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}