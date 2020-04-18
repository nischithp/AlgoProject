package SortingAlgorithms;
//Prajwal Prasad
//1001750483
public class QuickSort3Median {
	
	static void swap(int[] arr, int a, int b) {//Swap 2 array elements
		int temp;
		temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	
	static void insertionSort(int[] arr, int l, int r) {//Used for partition less than or equal to 10 to make sorting faster.
		for (int i=l+1; i<r; ++i)
		{
			int key = arr[i];
			int j =i-1;
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	
	static void quickSortMedian(int[] arr, int left, int right) {//Sort array using first, middle and last elements as 3 pivots.
		if(left>=right)
			return;
		else {
		int m=(left+right)/2; // to find middle element
		if (arr[left] > arr[m]) //swap if element on left is greater than element on middle
			swap(arr,left,m);
		if (arr[left] > arr[right]) //swap if element on left is greater than element on right
			swap(arr,left, right);
		if (arr[m]>arr[right]) //swap if element on middle is greater than element on right
			swap(arr,m, right);
		int pivot = arr[m];
		swap(arr,m,right-1);
		int i=left; int j=right-2;
		if (right-left<=10)
			insertionSort(arr, left, right); //call modified insertion sort when less than 10 vals
		else
		{
			while(true) 
			{
				while(arr[++i] < pivot);//pre increment
				while(arr[--j] > pivot);//pre decrement
				if (i<j)
					swap(arr,i, j);
				else 
					break;
			}
		swap(arr,i, right-1); //swap elements at i and right-1
		quickSortMedian(arr, left, i-1); //recursive call on left half
		quickSortMedian(arr, i+1, right); //recursive call on right half
		}
		}
	}
	
}
