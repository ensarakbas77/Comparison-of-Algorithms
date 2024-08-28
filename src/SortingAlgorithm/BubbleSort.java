package SortingAlgorithm;

import java.util.Iterator;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
		int uzunluk=arr.length-1;
		
		for (int i = 0; i < uzunluk; i++) {
			for (int j = 0; j < uzunluk-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
	}
	
	
}
