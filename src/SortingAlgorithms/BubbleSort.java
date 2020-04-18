package SortingAlgorithms;

//Name: 		Nischith Panish Javagal 
//Student ID: 	1001780908

public class BubbleSort {

	public static void bubbleSort() {
		
		enteredArray enteredBubbleArray = Sorting.getArray();
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
	
}
