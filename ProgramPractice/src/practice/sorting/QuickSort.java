package practice.sorting;

public class QuickSort {
	private static void quickSort(int arr[]) {
		quickSort(arr,0, arr.length-1);
	}
	private static void quickSort(int arr[], int left, int right) {
		if(left>=right) {
			return;
		}
		int pivot = arr[(left+right)/2];
		int index = partition(arr,left,right, pivot);
		
		quickSort(arr,left, index-1);
		quickSort(arr,index, right);
	}
	private static int  partition(int [] arr, int left, int right, int pivot) {
		while(left<=right) {
			while(arr[left]< pivot) {
				left++;
			}
			while(arr[right]> pivot) {
				right--;
			}
			if(left<= right) {
				swap(arr, left, right);
				left++;
				right--;
				
			}
			
		}
		
		return left;
	}
	
	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {6,7,2,1,9,4,5,3,8};
		quickSort(arr);
		for (int i : arr) {
			System.out.println(i);
	}

	}
}