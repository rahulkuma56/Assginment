package practice.sorting;

public class SelectionSort {
	private static void selectionSort(int [] arr) {
		int n = arr.length;
		int min;
		for(int i=0; i<n-1; i++) {
			min = i;
			for (int j = i+1; j < n; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}				
			}
			swap(arr, i, min);
		}
	}

	private static void swap(int[] arr, int i, int min) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {6,7,2,1,9,4,5,3,8};
		selectionSort(arr);
		for (int i : arr) {
			System.out.println(i);
	}
	}

}
