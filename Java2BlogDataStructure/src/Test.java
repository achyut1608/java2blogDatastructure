import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[]arfs) {
		Student s1 = new Student("Anil","Kumar");
		Student s2 = new Student("Mukesh","Kumar");
		Student s3 = new Student("Rajesh","Kumar");
		Student s4 = new Student("Test","Kumar");
		Student s5 = new Student("Koik","Kumar");
		
		HashMap<Integer,Student> map = new HashMap<Integer, Student>();
		
		map.put(5, s1);
		map.put(3, s2);
		map.put(1, s3);
		map.put(4, s4);
		map.put(2, s5);
	
		Set<Map.Entry<Integer,Student>> stSet = map.entrySet();
		List<Map.Entry<Integer,Student>> stList = new ArrayList<>(stSet);
		stList.sort((Map.Entry<Integer, Student> n1,Map.Entry<Integer,Student> n2) ->
		//n1.getValue().getFirst().compareTo(n2.getValue().getFirst()));
		n1.getKey().compareTo(n2.getKey()));
		
		for(Map.Entry<Integer, Student>n1:stList)
			System.out.println("Key : "+n1.getKey()+" value : "+n1.getValue().getFirst() + " "+ n1.getValue().getLast());
	}
}

class Student {
	
	String first,last;
	
	Student(String first,String last){
		this.first = first;
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	
	
}