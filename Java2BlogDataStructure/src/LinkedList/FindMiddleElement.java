package LinkedList;

public class FindMiddleElement {
	public static void main(String[]args) {
		List list = new List();
		
		list.addTop(10);
		list.addTop(20);
		list.addBottom(50);
		list.addBottom(40);
		
		Node head = list.getTopNode();
		System.out.println(middleElement(head).data);
		System.out.println("single pass : " + middleElementInSinglePass(head).data);
	}
	
	static Node middleElement(Node node) {
		
		Node fast = node,slow=node;
		
		while(fast != null && slow != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	static Node middleElementInSinglePass(Node node) {
		
		Node current = node,middle = node;
		int length=0;
		while(current.next != null) {
			length++;
			if(length%2 == 0)
				middle = middle.next;
			
			current = current.next;
			
		}
		
		if(length%2 == 1)
			middle= middle.next;
		
		return middle;
	}
}
