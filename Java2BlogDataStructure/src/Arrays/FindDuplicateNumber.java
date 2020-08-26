package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateNumber {
	public static void main(String[]args) {
		int ar[] = {1,34,23,45,23,1,12,25,25};
	
		findDuplicate(ar);
	}
	
	static void findDuplicate(int []ar) {
		HashMap <Integer,Integer> map = new HashMap<>();
		for(int number : ar) {
			if(map.containsKey(number)) 
				map.replace(number, map.get(number)+1);
			 else 
				map.put(number, 1);
			
			
		}
		
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) iterator.next();
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" iterates : " + entry.getValue());
		}
		
	}
}
