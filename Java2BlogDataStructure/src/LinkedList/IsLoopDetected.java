package LinkedList;

import java.util.HashSet;

public class IsLoopDetected {
	public static void main(String[]args) {
		List list = new List();
		list.addTop(30);
		list.addTop(20);
		list.addTop(10);
		list.addTop(40);
		//list.head.next.next.next.next = list.head.next.next;
		System.out.println(isLoopDetected(list.getTopNode()));
		System.out.println("loop found : "+foundLoopUsingHashSet(list.getTopNode()));
	}
	
	static String  isLoopDetected(Node node) {
		Node fast = node,slow = node;
		
		while(fast != null && slow != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast==slow) {
				return "loop found";
				
			}
		}
		return "loop not found";
		
	}
	
	static boolean foundLoopUsingHashSet(Node node) {
		HashSet<Node >set = new HashSet<>();
		while(node != null) {
			if(set.contains(node)) {
				System.out.println("Loop found");
				return true;
			}	  
			set.add(node);	
			node = node.next;	
			
		}
		return false;
	}
}
