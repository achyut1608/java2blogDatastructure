package LinkedList;

public class GetNthElementFromBottom {
	public static void main(String[]args) {
		List list = new List();
		list.addTop(10);
		list.addTop(20);
		list.addTop(30);
		list.addTop(40);
		list.addTop(50);
		try{
			Node node = getNthNodeFromBottom(5,list);
			System.out.println(node.data);
		} catch(NullPointerException ne ) {
			System.out.println("Invalid index");
		}
	}
	
	static Node getNthNodeFromBottom(int indexFromBottom,List list) {
		int length = list.size();
		int newIndex = length - indexFromBottom;
		if(newIndex>=0 && newIndex<=length) {
			
			if(indexFromBottom == length)
				return list.getTopNode();
			else {
				Node current = list.getTopNode();
				for(int i=0;i<length;i++) {
					if(newIndex==i)
						return current;
					else 
						current = current.next;
				}
			}
		}
		return null;	
	}
}
