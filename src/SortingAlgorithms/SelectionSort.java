package SortingAlgorithms;

// Name: 		Nischith Panish Javagal 
// Student ID: 	1001780908

public class SelectionSort {
	public static int[] selectionSort() {
		
		enteredArray enteredArray = Sorting.getArray();
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
		return a;
	}
}
