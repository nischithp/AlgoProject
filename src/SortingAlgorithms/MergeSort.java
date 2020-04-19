package SortingAlgorithms;

public class MergeSort {

	// Name: 		Nischith Panish Javagal 
	// Student ID: 	1001780908
	public static void mergeSort(int a[], int left, int right) {
		

		if(left < right)  
		{
			int mid;   
			mid = (left + right)/2;
			mergeSort(a , left , mid); 	 //left sub array - mergeSort
			mergeSort(a , mid+1, right); //right sub array - mergeSort
			merge(a, left ,mid , right); // merge operation 
		}
	}
	
	public static void merge(int arr[],int l,int mid,int r)
	{
		int n1 = (mid-l+1);  //getting size of left sub array
		int n2 = r-mid;    	 //getting size of right sub array
		int left[] = new int[n1]; 
		int right[] = new int[n2];
		int i;
		
		for (i=0;i<n1;i++)
		{
			left[i] = arr[l+i];   
		}
		
		for (i=0;i<n2;i++)
		{
			right[i] = arr[mid+1+i];
		}
		
		int leftiindex,rightIndex,arrayIndex;     
		leftiindex = 0;	
		rightIndex = 0;	
		arrayIndex = l;	
		
		while (leftiindex<n1 && rightIndex <n2)
		{
			if (left[leftiindex]<=right[rightIndex])	// minimum element will be placed in sorted sub array
			{
				arr[arrayIndex] = left[leftiindex];
				arrayIndex++;
				leftiindex++;
			}
			else
			{
				arr[arrayIndex] = right[rightIndex];
				arrayIndex++;
				rightIndex++;
			}
		}
		
		while(leftiindex < n1)	// copy remaining elements of left sub array into already merged array
		{
			arr[arrayIndex] = left[leftiindex];
			arrayIndex++;
			leftiindex++;
		}
		
		while(rightIndex < n2)	//copy remaining elements of right sub array into already merged array
		{
			arr[arrayIndex] = right[rightIndex];
			arrayIndex++;
			rightIndex++;
		}
	}

}
