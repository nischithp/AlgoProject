import java.util.Scanner;

public class BubbleSort {

	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operation = 0;
		while(true) {
			System.out.println("\n\n-------------------DAA Project-----------------------\n\n"
					+ "-----------Sorting Algorithms - Question 1------------\n\n"
					+ "Name: Nischith Javagal Panish\n"
					+ "Student ID Number: 1001780908\n"
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
			System.out.println(operation);
			switch(operation) {
			case 1: bubbleSort();	
					break;
			case 2: mergeSort();	
					break;
			case 3: heapSort();	
					break;
			case 4: quickSort();	
					break;
			case 5: quickSortMedian();	
					break;
			case 6: insertionSort();	
					break;
			case 7: selectionSort();	
					break;
			case 8: System.exit(0);
					break;
			default: System.out.println("Please enter a number between 1 and 8.");
			}

		}

	}

	private static void selectionSort() {
		// TODO Auto-generated method stub
		
	}

	private static void insertionSort() {
		// TODO Auto-generated method stub
		
	}

	private static void quickSortMedian() {
		// TODO Auto-generated method stub
		
	}

	private static void quickSort() {
		// TODO Auto-generated method stub
		
	}

	private static void heapSort() {
		// TODO Auto-generated method stub
		
	}

	private static void mergeSort() {
		// TODO Auto-generated method stub
		
	}

	private static void bubbleSort() {
		
		// Reading elements 
		System.out.println("Enter the length of the array to be sorted");
		int n = sc.nextInt();
		int[] a = new int[100];
		System.out.print("Enter the array elements one by one\n");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		//Entered Array
		System.out.print("Entered Array is:\n | ");
		for(int i=0; i<n ; i++) {
			System.out.print(a[i]+" | ");
		}
		
		//Sorting begins here
		boolean flag = false;
		int temp;
		while(!flag) {
			flag = true;
			for(int i=0; i<n; i++) {
				if (a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					flag = false;
				}
			}
		}
		System.out.print("\n\nSorted array is:\n | ");
		for(int i=1; i<n+1 ; i++) {
			System.out.print(a[i]+" | ");
		}
	}
}
