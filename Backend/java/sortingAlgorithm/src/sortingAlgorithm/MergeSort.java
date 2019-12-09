package sortingAlgorithm;

public class MergeSort {
	static int arr[]=new int[10];
public static void mergeSort(int low,int high) {
	if(low<high) {
		int middle=(low+high)/2;
		mergeSort(low,middle);
		mergeSort(middle+1,high);
		merge(low,middle,high);
	}
}

public static void merge(int low, int middle, int high) {
	int tempArray[]=new int[high-low+1];
	for(int i=low, j=middle+1,k=0;(i<=middle)||(j<=high);k++) {
		if(i>middle) {
			tempArray[k]=arr[j++];
		}
		else if(j>high) {
			tempArray[k]=arr[i++];
		}else if(arr[i]<= arr[j]) {
			tempArray[k]= arr[i++];
		}else {
			tempArray[k]=arr[j++];
		}
	}
	
	
}

}
