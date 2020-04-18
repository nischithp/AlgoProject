package SortingAlgorithms;
//Prajwal Prasad
//1001750483
public class QuickSort {

    static void quickSort(int arr[], int low, int high) { // arr: array to be sorted, low: lower index, high: upper index
        if (low >= high) //stop when low>high
            return;
        int p = partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    private static int partition(int arr[], int low, int high) {// arr: array to be sorted, low: lower index, high: upper index
        int pivot = arr[high]; //make upper index as pivot
        int j = low;
        int tmp;
        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) { //swap if current ele is less than pivot
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++; //increment low val
            }
        }
        tmp = arr[high]; //swap high and arr[j]
        arr[high] = arr[j];
        arr[j] = tmp;

        return j; //returns index of pivot element
    }
}