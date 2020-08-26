package LinkedList;

import java.util.HashSet;

public class RemoveDuplicateFromUnSortedList {
	public static void main(String[]args) {
		List list = new List();
		list.addTop(10);
		list.addTop(20);
		list.addTop(40);
		list.addTop(20);
		list.addTop(0);
		list.addTop(30);
		list.addTop(20);
		removeFromUnsortedList(list.getTopNode());
		removeUnsortedList(list.getTopNode());
	}
	
	
	static void removeFromUnsortedList(Node node) {
		Node current = node,prev=null;
		HashSet<Integer> set = new HashSet<>();
		while(current != null) {
			int currentVal = current.data;
			if(set.contains(currentVal))
				prev.next = current.next;
			else {
				set.add(currentVal);
				prev = current.next;
			}
			current = current.next;
		}
		System.out.println(set);
	}
	
	static void removeUnsortedList(Node node) {
		Node ptr1=node,ptr2 = null,dup=null;
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			while(ptr2.next != null) {
				if(ptr1.data == ptr2.next.data) {
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
				} else {
					ptr2 = ptr2.next;
				}
			}
			
			ptr1 = ptr1.next;
		}
		
		while(node != null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
}
