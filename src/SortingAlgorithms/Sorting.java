package SortingAlgorithms;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Sorting {

	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operation = 0;
		while(true) {
			System.out.println("\n\n-------------------DAA Project-----------------------\n\n"
					+ "-----------Sorting Algorithms - Question 1------------\n\n"
					+ "Team: Nischith Javagal Panish (1001780908) and Prajwal Prasad (1001750483) \n"
					+ "Enter the number assosiated with the operation you want to perform or press 8 to exit:\n"
					+ "1. Bubble Sort\n"
					+ "2. Mergesort\r\n" 
					+ "3. Heapsort\r\n" 
					+ "4. Quick sort (Regular quick sort)\n"
					+ "5. Quick sort using 3 medians\r\n" 
					+ "6. Insertion sort\r\n" 
					+ "7. Selection sort\r\n"
					+ "8. Exit");
			
			operation = sc.nextInt();
			Instant start, end;
			switch(operation) {
			case 1: BubbleSort.bubbleSort();	
					break;
			case 2: enteredArray enteredMergeArray = getArray();
					int n = enteredMergeArray.n;
					int a[] = enteredMergeArray.a;
					start = Instant.now();
					MergeSort.mergeSort(a,0,n);
					end = Instant.now();
					System.out.println("Sorted Array is : \n | ");
					printArray(a,a.length);
					System.out.println("Run time is: "+Duration.between(start, end).toMillis()+" ms");
					break;
			case 3: enteredArray enteredHeapArray = getArray();
					int h[] = enteredHeapArray.a;
					start = Instant.now();
					HeapSort.heapSort(h);	
					end = Instant.now();
					System.out.print("Sorted Array is : \n | ");
					printArray(h,h.length);
					System.out.println("Run time is: "+Duration.between(start, end).toMillis()+" ms");
					break;
			case 4: enteredArray enteredQuickSortArray = getArray();
					int qn = enteredQuickSortArray.n;
					int q[] = enteredQuickSortArray.a;
					start = Instant.now();
					QuickSort.quickSort(q, 0, qn);
					end = Instant.now();					
					System.out.print("Sorted Array is : \n | ");
					printArray(q,q.length);
					System.out.println("Run time is: "+Duration.between(start, end).toMillis()+" ms");
					break;
			case 5: enteredArray enteredQS3MedianArray = getArray();
					int qn3 = enteredQS3MedianArray.n;
					int qs3[] = enteredQS3MedianArray.a;	
					start = Instant.now();
					QuickSort3Median.quickSortMedian(qs3, 0, qn3); 
					end = Instant.now();				
					System.out.print("Sorted Array is : \n | ");
					printArray(qs3,qs3.length);
					System.out.println("Run time is: "+Duration.between(start, end).toMillis()+" ms");
					break;
			case 6: enteredArray enteredInsertionSortArray = getArray();
					int i[] = enteredInsertionSortArray.a;
					start = Instant.now();
					InsertionSort.insertionSort(i);
					end = Instant.now();
					System.out.print("Sorted Array is : \n | ");
					printArray(i,i.length);
					System.out.println("Run time is: "+Duration.between(start, end).toMillis()+" ms");
					break;
			case 7: SelectionSort.selectionSort();	
					break;
			case 8: System.exit(0);
					break;
			default: System.out.println("Please enter a number between 1 and 8.");
			}

		}

	}

	
	//Helper functions and classes
	public static enteredArray getArray() {
		// Reading elements 
		System.out.println("Enter the length of the array to be sorted");
		int n = sc.nextInt();
		int[] a = new int[n+1];
		System.out.print("Enter the array elements one by one\n");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		//Entered Array
		System.out.print("Entered Array is:\n | ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+ " | ");
		}
		System.out.println();

		enteredArray enteredarray = new enteredArray(a,n); 
		return enteredarray;
	}
	
	public static void printArray(int a[], int n)
	{
		int n1 = a.length;
		
		for (int i=1; i<n1; ++i)
			System.out.print(a[i] + " | ");
		
		System.out.println();
	}
	
}

 class enteredArray {
	int[] a;
	int n;
	
	public enteredArray(int[] a, int n) {
		this.a = a;
		this.n = n;
	}
}
