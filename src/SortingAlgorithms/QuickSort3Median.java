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
	
	
	static void quickSortMedian(int[] arr, int l, int r) {//Sort array using first, middle and last elements as 3 pivots.
		if(l>=r)
			return;
		else {
		int m=(l+r)/2; // to find middle element
		if (arr[l] > arr[m])
			swap(arr,l,m);
		if (arr[l] > arr[r])
			swap(arr,l, r);
		if (arr[m]>arr[r])
			swap(arr,m, r);
		int pivot = arr[m];
		swap(arr,m,r-1);
		int i=l; int j=r-2;
		if (r-l<=10)
			insertionSort(arr, l, r);
		else
		{
			while(true) 
			{
				while(arr[++i] < pivot);
				while(arr[--j] > pivot);
				if (i<j)
					swap(arr,i, j);
				else 
					break;
			}
		swap(arr,i, r-1);
		quickSortMedian(arr, l, i-1); //recursive call on left half
		quickSortMedian(arr, i+1, r); //recursive call on right half
		}
		}
	}
	
}
