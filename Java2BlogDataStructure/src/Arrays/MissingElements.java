package Arrays;

import java.util.BitSet;

public class MissingElements {
	public static void main(String[]args) {
		findMissingElements(10);
	}


	static void findMissingElements(int count) {
		int[]ar = new int[] {1,3,5,9};
		
		BitSet bitSet = new BitSet(count);
		for(int number:ar) {
			bitSet.set(number-1);
		}
		
		int totalMissingNumber = count - ar.length;
		int lastMissingNumber=0;
		for(int i=0;i<totalMissingNumber;i++) {
			lastMissingNumber = bitSet.nextClearBit(lastMissingNumber);
			System.out.println(++lastMissingNumber);
		}
	}
}


