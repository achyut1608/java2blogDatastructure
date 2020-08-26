package LinkedList;

public class GetLength {
	public static void main(String[]args) {
		List list = new List();
		list.addTop(50);
		list.addTop(40);
		list.addTop(30);
		list.addTop(20);
		list.addTop(10);
		getLengthIterative(list.getTopNode());
		System.out.println(getLengthRecursive(list.getTopNode()));
	}
	
	static void getLengthIterative(Node node) {
		Node current = node;
		if(node != null) {
			int length = 1;
			while(current.next != null) {
				++length;
				current = current.next;
			}
			System.out.println("Length : " + length);
		}  else {
			System.out.println("list is empty");
		}
	}
	
	static int getLengthRecursive(Node node) {
		int length=1;
		if(node == null)
			return length;
		else {
			if(node.next != null)
				length+=getLengthRecursive(node.next);
		}
		return length;
	}
}
