package sortingAlgorithm;

import java.util.Scanner;

public class TestSorting {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of elements: ");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter "+n+ " Number : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();

		}

		BubbleSort bo= new BubbleSort();
		bo.bubbleSort(arr);
		System.out.println("Shorted array using bubble short technique");
		bo.printArray(arr);
		
		

	}
}
