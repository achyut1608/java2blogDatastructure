package LinkedList;

public class SearchElement {
	public static void main(String[]args) {
		List list = new List();
		list.addTop(50);
		list.addTop(40);
		list.addTop(30);
		list.addTop(20);
		list.addTop(10);
		Node head = list.getTopNode();
		try {
			boolean found = getElementIterative(10,list);
			boolean isFound = getElementRecursive(010,head);
			System.out.println("iterator : " + found);
			System.out.println("Recursive : " + isFound);
		} catch(NullPointerException ne) {
			System.out.println("Element is not there");
		}
		
		if(10==010)
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
	}
	
	static boolean getElementIterative(int data,List list) {
		if(list.isEmpty())
			System.out.println("List is empty");
		else {
			Node current = list.getTopNode();
			for(int i=0;i<list.size();i++) {
				if(current.data==data)
					return true;
				else {
					current = current.next;
				}
			}
		}
		
		return false;
	}
	
	static boolean getElementRecursive(int data,Node node) {
		if(node.data==data)
			return true;
		else {
			if(node.next != null)
				getElementRecursive(data, node.next);
			else {
				if(node.data==data)
					return true;
			}
		}
		return false;
	}
}
