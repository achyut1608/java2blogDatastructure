package LinkedList;

public class ReverseLinkedList {
	public static void main(String[]args) {
		
		List list = new List();
		
		list.addTop(10);
		list.addTop(20);
		list.addTop(30);
		reverse(list.getTopNode());
	}
	
	static void reverse(Node node) {
		Node current = node,head = null,prev = null;
		while(current != null) {
			head = current.next;
			current.next = prev;
			prev = current;
			current = head;
		}
		
		while(prev != null) {
			System.out.println(prev.data);
			prev = prev.next;
		}
	}
}
