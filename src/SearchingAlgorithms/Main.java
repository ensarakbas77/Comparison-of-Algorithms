 package SearchingAlgorithms;

import java.awt.image.BandCombineOp;

public class Main {

	
	public static void main(String[] args) {
		
		//Searching Algorithm --> Linear Search O(n) complexity
		//we use on small data sets
		//it doesn't matter if it's sorted
		
		
		System.out.println("**********Linear Search**********");
		int[] array=new int[] {15,2,94,23,51};
		int search=94; //indis:2
		LinearSearch linearSearch=new LinearSearch();
		linearSearch.linearSearch(array,search);
		linearSearch.printIndex();
		
		
		//Searching Algorithm --> Binary Search O(logn) complexity
		//the array must be in order!
		//Binary search is faster than linear search, especially for large arrays.
		System.out.println("\n**********Binary Search**********");
		
		int[] arr=new int[] {2,5,10,23,41,59,70};
	    
		//Function parameter
		int low=0;
		int high=arr.length-1;
		int target=41;
		
		//Create a instance
		BinarySearchAlgorithm binary_search=new BinarySearchAlgorithm();
		int result=binary_search.binarySearch(arr, low, high, target);
		
		System.out.println("Recursive Fuction");
		if (result==-1) {
			System.out.println("Searched element isn't found!");
		}
		else {
			System.out.println("Searched element is found at index: "+result);
		}
		
		
		int _result=binary_search._binarySearch(arr, low, high, target);
		System.out.println("\nIterative Solution");
		if (_result==-1) {
			System.out.println("Searched element isn't found!");
		}
		else {
			System.out.println("Searched element is found at index: "+_result);
		}
		
		
		
	}

}
