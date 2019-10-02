package practice.sorting;

public class InsertionSort {
	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 7, 2, 1, 9, 4, 5, 3, 8 };
		insertionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
