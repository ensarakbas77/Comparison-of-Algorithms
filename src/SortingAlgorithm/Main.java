package SortingAlgorithm;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*****Bubble Sort*****");
		//This algorithm's time complexity is O(n^2). 
		//And useful for small data sets.
		
		int[] array=new int[]{12,4,75,32,51,44,29,60,99};
		System.out.print("Before Sorted Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		//Create a instance
		BubbleSort bubble_sort=new BubbleSort();
		bubble_sort.bubbleSort(array);
		
		//print the array
		System.out.print("\nSorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		System.out.println("*****Selection Sort*****");
		//This algorithm's time complexity is O(n^2).
		//Useful for small data sets.
		
		int[] arr=new int[] {51,12,4,66,23,7,78,19,98};
		System.out.print("Before Sorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Create a instance
		SelectionSort selectionSort=new SelectionSort();
		selectionSort.selectionSort(arr);
		
		//print the array
		System.out.print("\nSorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n");
		System.out.println("*****İnsertion Sort*****");
		//This algorithm's time complexity is O(n^2).
		//Useful for small data sets 
		
		int[] numbers=new int[] {12,41,53,7,32,71,25,89,39};
		System.out.print("Before Sorted Array: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		//Create a instance 
		InsertionSort insertionSort=new InsertionSort();
		insertionSort.insertionSort(numbers);
		
		//print the array
		System.out.print("\nSorted array: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("\n\n*****Merge Sort*****");
		//This algorithm's time complexity O(nlog(n))
		int[] dizi=new int[] {22,3,51,17,6,43,70,123};
		System.out.print("Before Sorted Array: ");
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+" ");
		}
		MergeSort merge_Sort=new MergeSort();
		merge_Sort.mergeSort(dizi);
		
		System.out.println();
		System.out.print("Sorted Array: ");
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+ " ");
		}
		
		
		
		
	}

}
