package LinkedList;

public class ListIsPalindrome {
	public static void main(String[]args) {
		List list = new List();
		
		list.addTop(20);
		list.addBottom(30);
		list.addTop(30);
		
		Node head = list.getTopNode();
		Node prev = reverse(head);
		System.out.println(isPalindrome(head,prev));
	}
	
	static Node reverse(Node node) {
		Node prev = null,head = null,current = node;
		
		while(current != null) {
			head = current.next;
			current.next = prev;
			prev = current;
			current = head;
		}
		
		return prev;
	}
	
	static boolean isPalindrome(Node head,Node prev) {
		while(head != null && prev != null) {
			if(head.data != prev.data)
				return false;
			head = head.next;
			prev = prev.next;
		}
		return true;	
	}
}
