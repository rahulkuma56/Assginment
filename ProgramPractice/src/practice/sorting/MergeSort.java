package practice.sorting;

public class MergeSort {
	private static void mergeSort(int [] arr) {
		mergeSort(arr,new int[arr.length], 0, arr.length-1);
	}

	private static void mergeSort(int[] arr, int [] temp, int leftStart, int rightEnd) {
		// TODO Auto-generated method stub
		if(leftStart>=rightEnd) {
			return;
		}
		int middile = (leftStart+rightEnd)/2;
		mergeSort(arr, temp, leftStart, middile);
		mergeSort(arr, temp, middile+1, rightEnd);
		merge(arr, temp, leftStart, rightEnd);
	}

	private static void merge(int[] arr, int [] temp, int leftStart, int rightEnd) {
		// TODO Auto-generated method stub
		int leftEnd = (leftStart+rightEnd)/2;
		int rightStart = leftEnd+1;
		int size = rightEnd-leftStart+1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left<= leftEnd && right<=rightEnd) {
			if(arr[left]<= arr[right]) {
				temp[index] = arr[left];
				left++;
				
			}else {
				temp[index] = arr[right];
				right++;
			}
			index++;
		}
		System.arraycopy(arr, left, temp, index, leftEnd-left+1);
		System.arraycopy(arr, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {6,7,2,1,9,4};
		mergeSort(arr);
		for (int i : arr) {
			System.out.println(i);
	}

	}

}
