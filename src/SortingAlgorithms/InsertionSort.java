package SortingAlgorithms;
//Prajwal Prasad
//1001750483
public class InsertionSort {
	static void insertionSort(int arr[]) {
        int len = arr.length, tmp, j;
        for (int i = 1; i < len; i++) {
            tmp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > tmp)
                    arr[j] = arr[j - 1];
                else
                    break;
            }
            arr[j] = tmp;
        }
	}
}
