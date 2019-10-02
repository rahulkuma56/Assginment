package practice.sorting;

public class BubbuleSort {
	
	private static void bubbleSort(int [] arr) {
		boolean isSorted = false;
		int lastUnsorted = arr.length-1;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted; i++) {
				if(arr[i]> arr[i+1]) {
					swap(arr,i, i+1);
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
	}
	private static void swap(int [] arr,int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int []arr = {6,7,2,1,9,4};
		bubbleSort(arr);
		for (int i : arr) {
			System.out.println(i);
			
		}
		

	}

}
