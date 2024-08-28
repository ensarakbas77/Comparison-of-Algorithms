package SearchingAlgorithms;

import java.util.Iterator;

public class LinearSearch {
	//global variable
	int index;
	
	public int linearSearch(int[] arr,int search) {
		index=0;
		for (int i = 0; i < arr.length; i++) {
			if (search==arr[i]) {
				index=i;
			}
		}
		
		return index;
	}
	
	public void printIndex() {
		
		System.out.println("Searched element is found at index: "+index);
	}
	
}
