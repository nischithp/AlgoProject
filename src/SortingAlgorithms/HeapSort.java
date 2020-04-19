package SortingAlgorithms;
//Prajwal Prasad
//1001750483
public class HeapSort {

	public static void heapSort(int arr[]) { //arr is the input array
        makeMaxHeap(arr);
        int temp;
        for (int i = arr.length - 1; i > 0; i--) { //start from last element
            temp = arr[0];						  // swap with first element
            arr[0] = arr[i];
            arr[i] = temp;
            adjustHeap(arr, 0, i);
        }
	}
	public static void makeMaxHeap(int arr[]) { //create a max heap
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; --i) { // iteratively shrinks the unsorted region by extracting the largest element and moving that to the sorted region
        	adjustHeap(arr, i, len);
        }
    }

    public static void adjustHeap(int arr[], int i, int n) { //create down heap
        int j = 2 * i + 1;
        int temp = arr[i]; //assign element at i to temp
        while (j < n) {
            if (j < n - 1 && arr[j] < arr[j + 1])
                j++;
            if (temp > arr[j]) //stop loop when temp exceeds element at j
                break;
            arr[(j - 1) / 2] = arr[j];
            j = 2 * j + 1;
        }
        arr[(j - 1) / 2] = temp; //assign temp value to element at j-1/2
    }
}
