package Arrays;

import java.util.HashMap;

public class CommonElementIn3SortedArray {
	public static void main(String[]args) {
		int ar1[] = {23,42,67,90,123,456};
		int []ar2 = {11,23,67,86,123};
		int []ar3 = {1,2,23,34,67,123,234};
		common(ar1,ar2,ar3);
	}
	
	static void common(int []ar1,int []ar2,int[]ar3) {
		int i=0,j=0,k=0;
		/*while(i<ar1.length&&j<ar2.length&&k<ar3.length) {
			if(ar1[i]==ar2[j] && ar2[j]==ar3[k]) {
				System.out.println(ar1[i]);
				i++;
				j++;
				k++;
			} else if(ar1[i]<ar2[j])
				i++;
			else if(ar2[j]<ar3[k])
				j++;
			else
				k++;*/
		
		while(i<ar1.length&&j<ar2.length&&k<ar3.length) {
			if(ar1[i]==ar2[j] && ar2[j]==ar3[k]) { 
				System.out.println(ar1[i]);
				i++;
				j++;
				k++;
			}else if(ar1[i]<ar2[j]) {
				i++;
			} else if(ar3[k]>ar2[j]) {
				j++;
			} else 
				k++;
		}
	}
}
