package LinkedList;

public class List {
	private Node head;
	private int size;
	
	void addTop(int data) {
		if(head == null)
			head = new Node(data);
		else {
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
		size++;
	}
	
	void addBottom(int data) {
		if(head == null)
			addTop(data);
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			Node node = new Node(data);
			current.next = node;
			size++;
		}
	}
	
	void addAtIndex(int index,int data) {
		if(index<1||index>size+1)
			System.out.println("Invalid index");
		else if(index==1)
			addTop(data);
		else if(index==size()+1)
			addBottom(data);
		else {
			Node current = head;
			for(int i=0;i<size;i++) {
				if(index-2==i) {
					Node node = new Node(data);
					Node n = current.next;
					current.next = node;
					node.next = n;
					size++;
					break;
				} else 
					current = current.next;
			}
		}
	}
	
	void removeTop() {
		if(head==null)
			System.out.println("List is empty");
		else {
			head = head.next;
			size--;
		}
	}
	
	void removeBottom() {
		if(head==null) {
			System.out.println("List is empty");
		} else {
			
			Node current = head;
			
			while(current.next.next != null) 
				current = current.next;
			
			current.next = null;
			size--;
			
		}
	}
	
	void removeAtIndex(int index) {
		if(index<1 || index>size)
			System.out.println("invalid index");
		else if(index==1)
			removeTop();
		else if(index==size())
			removeBottom();
		else {
			Node current = head;
			for(int i=0;i<size;i++) {
				if(index-2==i) {
					current.next = current.next.next;
					size--;
					break;
				} else 
					current = current.next;
			}
		}
	}
	
	int size() {
		return size;
	}
	
	void print() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	boolean isEmpty() {
		return head==null;
	}
	
	Node getTopNode(){
		return head;
	}
}
