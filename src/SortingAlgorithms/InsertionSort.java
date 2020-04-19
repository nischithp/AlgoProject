package SortingAlgorithms;
//Prajwal Prasad
//1001750483
public class InsertionSort {
	static void insertionSort(int arr[]) { //arr: input array to be sorted
        int length = arr.length, temp, j;
        for (int i = 1; i < length; i++) {
            temp = arr[i]; //assign current element to temp
            for (j = i; j > 0; j--) { //inner loop starting from current element and decreases till first element
                if (arr[j - 1] > temp)
                    arr[j] = arr[j - 1]; //swap if previous element is greater than current element
                else
                    break;
            }
            arr[j] = temp; //assign temp
        }
	}
}
