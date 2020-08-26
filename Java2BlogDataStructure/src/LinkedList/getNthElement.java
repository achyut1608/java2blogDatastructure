package LinkedList;

public class getNthElement {
	public static void main(String[]args) {
		List list = new List();
		list.addTop(10);
		list.addTop(20);
		list.addTop(30);
		list.addTop(40);
		list.addTop(50);
		try {
			Node node = getNode(5,list);
			System.out.println("data : " + node.data);
		} catch(NullPointerException ex) {
			System.out.println("Enter valid index");
		}
		
	}
	
	static Node getNode(int index,List list) {
		if(index<1||index>list.size()) 
			System.out.println("invalid index");
		
		else {
			Node current = list.getTopNode();
			if(index==1)
				return current;
			else {
				for(int i=0;i<list.size();i++) {
					if(index-2==i) {
						return current.next; 
					} else 
						current = current.next;
				}
			}
		}
		return null;
	}
	
}
