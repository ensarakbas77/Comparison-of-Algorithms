package SortingAlgorithm;

public class InsertionSort {

	public void insertionSort(int[] arr) {
		
		int uzunluk=arr.length;
		
		for (int i = 1; i < uzunluk; i++) {
			int temp=arr[i];
			int j=i;
			while (j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}
}
