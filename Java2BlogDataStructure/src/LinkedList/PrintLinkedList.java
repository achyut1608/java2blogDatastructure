package LinkedList;

public class PrintLinkedList {
	public static void main(String[]args) {
		List list = new List();
		
		list.addBottom(0);
		list.addTop(10);
		list.addTop(20);
		list.addTop(30);
		list.addBottom(-10);
		list.addAtIndex(7, 100);
		list.print();
	}
}
