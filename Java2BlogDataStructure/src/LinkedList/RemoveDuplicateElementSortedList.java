package LinkedList;

public class RemoveDuplicateElementSortedList {
	public static void main(String[]args) {
		List list = new List();
		
		list.addTop(10);
		list.addTop(10);
		list.addTop(20);
		list.addTop(20);
		list.addTop(30);
	
		Node head = list.getTopNode();
		removeDuplicate(head);
	}
	
	static void removeDuplicate(Node node) {
		Node current = node;
		while(current != null) {
			Node temp =current.next;
			
			while(temp != null && temp.data==current.data) {
				temp = temp.next;
			}
			
			
			current.next = temp;
			current = current.next;
		}
		
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
