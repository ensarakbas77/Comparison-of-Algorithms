package SearchingAlgorithms;

public class Comparison {

	public static void main(String[] args) {
		
		/* How fast they work ?
		 * 
		 * long startTime=System.nanoTime();
		 * 
		 * do something in between
		 * 
		 * long endTime=System.nanoTime();
		 * 
		 * long elapsedTime=endTime-startTime;
		*/
		
		//Define an array for linear search
		System.out.println("***Linear Search***");
		long startTime1=System.nanoTime();
		int[] array1= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,
		15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30	
		};
		LinearSearch linearSearch=new LinearSearch();
		linearSearch.linearSearch(array1,26);
		linearSearch.printIndex();
		long endTime1=System.nanoTime();
		System.out.println();
		
		//Define an array for binary search
		System.out.println("***Binary Search***");
		long startTime2=System.nanoTime();
		int[] array2= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,
		15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30	
		};
		BinarySearchAlgorithm binarySearch=new BinarySearchAlgorithm();
		int result=binarySearch._binarySearch(array2, 0, 29, 26);
		
		if (result==-1) {
			System.out.println("Searched element isn't found!");
		}
		else {
			System.out.println("Searched element is found at index: "+result);
		}
		System.out.println();
		long endTime2=System.nanoTime();
		
		
		//Passing time
		long elapsedTime1=endTime1-startTime1;
		System.out.println("Linear Search "+elapsedTime1+" ns");
		
		long elapsedTime2=endTime2-startTime2;
		System.out.println("Binary Search: "+elapsedTime2+" ns");
	}

}
