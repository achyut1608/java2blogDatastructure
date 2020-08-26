package Arrays;

public class FindMaximumAndMinimumInArray {
	public static void main(String[]args) {
		int [] ar = {34,23,12,77,87,56,132,1}; 
		findMaxAndMin(ar);
	}
	
	static void findMaxAndMin(int []ar) {
		int max = ar[0],min=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i])
				max = ar[i];
			else if(min>ar[i])
				min = ar[i];
		}
		
		System.out.println("Max : " + max + " min : " + min);
		
		
	}
}
