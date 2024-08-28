package SortingAlgorithm;

import java.io.CharArrayReader;
import java.lang.reflect.AnnotatedArrayType;
import java.util.Iterator;

public class SelectionSort {

	public void selectionSort(int[] arr) {
		int length =arr.length;
		for (int i = 0; i < length-1; i++) {
			int minIndex=i;
			
			for (int j = i+1; j < length; j++) {
				if (arr[j]<arr[minIndex]) 
					minIndex=j;
				
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
		}
		
	}
}
