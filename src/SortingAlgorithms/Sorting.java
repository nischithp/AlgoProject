package SortingAlgorithms;
import java.util.Scanner;

public class Sorting {

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
			
			switch(operation) {
			case 1: bubbleSort();	
					break;
			case 2: enteredArray enteredMergeArray = getArray();
					int n = enteredMergeArray.n;
					int a[] = enteredMergeArray.a;
					mergeSort(a,0,n);
					System.out.print("Sorted Array is : \n | ");
					printArray(a,a.length);
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
		
		enteredArray enteredArray = getArray();
		int[] a = enteredArray.a;
		int n = enteredArray.n;
		for (int i = 0; i < a.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[index]) 
                    index = j;
 
            int smallerNumber = a[index];  
            a[index] = a[i];
            a[i] = smallerNumber;
        }
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

	private static void mergeSort(int a[], int left, int right) {

		if(left < right)  
		{
			int mid;   
			mid = (left + right)/2;
			mergeSort(a , left , mid);  //left sub array - mergeSort
			mergeSort(a , mid+1, right); //right sub array - mergeSort
			merge(a, left ,mid , right); // merge operation 
		}
	}
	
	public static void merge(int arr[],int l,int mid,int r)
	{
		int n1 = (mid-l+1);  //getting size of left sub array
		int n2 = r-mid;     //getting size of right sub array
		int left[] = new int[n1]; 
		int right[] = new int[n2];
		int i;
		
		for (i=0;i<n1;i++)
		{
			left[i] = arr[l+i];   
		}
		
		for (i=0;i<n2;i++)
		{
			right[i] = arr[mid+1+i];
		}
		
		int leftiindex,rightIndex,arrayIndex;     
		leftiindex = 0;	//left index
		rightIndex = 0;	//right index
		arrayIndex = l;	//array index
		
		while (leftiindex<n1 && rightIndex <n2)
		{
			if (left[leftiindex]<=right[rightIndex])	// minimum element will be placed in sorted sub array
			{
				arr[arrayIndex] = left[leftiindex];
				arrayIndex++;
				leftiindex++;
			}
			else
			{
				arr[arrayIndex] = right[rightIndex];
				arrayIndex++;
				rightIndex++;
			}
		}
		
		while(leftiindex < n1)	// copy remaining elements of left sub array into the merged array
		{
			arr[arrayIndex] = left[leftiindex];
			arrayIndex++;
			leftiindex++;
		}
		
		while(rightIndex < n2)	//copy remaining elements of right sub array into the merged array
		{
			arr[arrayIndex] = right[rightIndex];
			arrayIndex++;
			rightIndex++;
		}
	}

	private static void bubbleSort() {
		
		enteredArray enteredBubbleArray = getArray();
		int a[] = enteredBubbleArray.a;
		int n = enteredBubbleArray.n;
		
		//Sorting begins here
		boolean flag = false;
		int temp;
		while(!flag) {
			flag = true;
			for(int i=0; i<n; i++) {
				if (a[i] > a[i+1]) {
					temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
					flag = false;
				}
			}
		}
		System.out.print("\n\nSorted array is:\n | ");
		for(int i=1; i<n+1 ; i++) {
			System.out.print(a[i]+" | ");
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
