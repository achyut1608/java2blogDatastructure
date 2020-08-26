package Arrays;

public class FindAnElement {
	public static void main(String[]args) {
		int []ar = {23,65,12,6,87,100};
		System.out.println(16 +" is in array : " +usingLinearSearch(ar, 16));
	
		int []binarySearch = {1,34,68,78,90,124,650};
		System.out.println("index : "+binarySearch(binarySearch, 0, ar.length-1, 124));
	}
	
	static boolean usingLinearSearch(int []ar,int elementsToSearch) {
		for(int i=0;i<ar.length;i++){
			if(elementsToSearch==ar[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	  static int usingBinarySearch(int []ar,int first,int last,int elementsToSearch) {
	  
		  if(first<=last) {
			  int middle = (first+last)/2;
			  
			  if(ar[middle]==elementsToSearch)
				  return middle;
			  if(ar[middle]>elementsToSearch)
				  return usingBinarySearch(ar, first, middle-1, elementsToSearch);
			  
			  return usingBinarySearch(ar, middle+1, last, elementsToSearch);
		  }
		  return -1;
	  }
	 
	
	static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
	
	 
}
