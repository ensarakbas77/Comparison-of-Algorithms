package SearchingAlgorithms;

import java.awt.image.BandCombineOp;

public class BinarySearchAlgorithm {

	//Recursive function
	public int binarySearch(int[] arr,int low,int high,int target) {
		
		if (low<=high) {
			int mid=low+(high-low)/2;
			if (arr[mid]==target) {
				return mid;
			}
			if (arr[mid]<target) {
				return binarySearch(arr, mid+1, high, target);
			}
			else {
				return binarySearch(arr, low, mid-1, target);
			}
		}
		
		return -1;
	}
	
	//Iterative Solution
	public int _binarySearch(int[] arr,int low,int high,int target) {
	
		while (low<=high) {
			int mid=low+(high-low)/2;
			if (arr[mid]==target) {
				return mid;
			}
			if (arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;	
			}
		}
		return -1;
	}

	
	

}
