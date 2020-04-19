package SortingAlgorithms;
//Prajwal Prasad
//1001750483
public class HeapSort {
	public static void heapSort(int arr[]) {
		long startTime = System.currentTimeMillis();

        makeMaxHeap(arr);
        int tmp;
        
        for (int i = arr.length - 1; i > 0; i--) {
            tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapAdjust(arr, 0, i);
        }
		long endTime = System.currentTimeMillis();
		System.out.println("\n Runtime: "+(endTime - startTime)/1000 + " ms");
	}
	public static void makeMaxHeap(int arr[]) {
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; --i) {
            heapAdjust(arr, i, len);
        }
    }

    public static void heapAdjust(int arr[], int i, int n) {
        int j = 2 * i + 1;
        int tmp = arr[i];
        while (j < n) {
            if (j < n - 1 && arr[j] < arr[j + 1])
                j++;
            if (tmp > arr[j])
                break;
            arr[(j - 1) / 2] = arr[j];
            j = 2 * j + 1;
        }
        arr[(j - 1) / 2] = tmp;
    }
}
