package SortingAlgorithm;

public class Comparison {

	public static void main(String[] args) {


		/* Ne kadar hızlı çalışıyorlar ?
		 * 
		 * long startTime=System.nanoTime();
		 * 
		 * do something in between
		 * 
		 * long endTime=System.nanoTime();
		 * 
		 * long elapsedTime=endTime-startTime;
		*/
		
		
		System.out.println("***Bubble Sort***");
		//Define an array for bubble sort
		int array1[]= {91,21,12,41,34,2,19,39,54,7,
				       72,10,100,31,76,89,0,15,32};
		long startTime1=System.nanoTime();
		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.bubbleSort(array1);
				
		long endTime1=System.nanoTime();
		long elapsedTime1=endTime1-startTime1;
		System.out.println("Bubble Sort: "+elapsedTime1+" ns\n");
		
		System.out.println("***Insertion Sort***");
		//Define an array for insertion sort
		int array2[]= {91,21,12,41,34,2,19,39,54,7,
			       72,10,100,31,76,89,0,15,32};
		long startTime2=System.nanoTime();
		InsertionSort insertionSort=new InsertionSort();
		insertionSort.insertionSort(array2);
		
		long endTime2=System.nanoTime();
		long elapsedTime2=endTime2-startTime2;
		System.out.println("Insertion Sort: "+elapsedTime2+" ns\n");
		
		
		System.out.println("***Selection Sort***");
		//Define an array for selection sort
		int array3[]= {91,21,12,41,34,2,19,39,54,7,
			       72,10,100,31,76,89,0,15,32};
		
		long startTime3=System.nanoTime();
		SelectionSort selectionSort=new SelectionSort();
		selectionSort.selectionSort(array3);
		
		long endTime3=System.nanoTime();
		long elapsedTime3=endTime3-startTime3;
		System.out.println("Selection Sort: "+elapsedTime3+" ns\n");
		
		System.out.println("***Merge Sort***");
		//Define an array for merge sort
		int array4[]= {91,21,12,41,34,2,19,39,54,7,
			       72,10,100,31,76,89,0,15,32};
		long startTime4=System.nanoTime();
		MergeSort mergeSort=new MergeSort();
		mergeSort.mergeSort(array4);
		
		long endTime4=System.nanoTime();
		long elapsedTime4=endTime4-startTime4;
		System.out.println("Merge Sort: "+elapsedTime4+" ns");
	}

}
