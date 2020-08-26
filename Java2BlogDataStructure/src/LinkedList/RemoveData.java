package LinkedList;

public class RemoveData {
	public static void main(String[]args) {
		List list = new List();
		list.addTop(30);
		list.addTop(20);
		list.addTop(10);
		list.addBottom(40);
		list.print();
		System.out.println("remove data...");
		list.removeAtIndex(1);
		list.print();
	}
}