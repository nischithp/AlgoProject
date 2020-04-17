package SortingAlgorithms;
//Prajwal Prasad
//1001750483
public class QuickSort {

    static void quickSort(int arr[], int lower, int upper) { // arr: array to be sorted, lower: lower index, upper: upper index
        if (lower >= upper)
            return;
        int p = partition(arr, lower, upper);
        quickSort(arr, lower, p - 1);
        quickSort(arr, p + 1, upper);
    }

    private static int partition(int arr[], int lower, int upper) {// arr: array to be sorted, lower: lower index, upper: upper index
        int pivot = arr[upper];
        int j = lower;
        int tmp;
        for (int i = lower; i <= upper; i++) {
            if (arr[i] < pivot) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        tmp = arr[upper];
        arr[upper] = arr[j];
        arr[j] = tmp;

        return j; //returns index of pivot element
    }
}