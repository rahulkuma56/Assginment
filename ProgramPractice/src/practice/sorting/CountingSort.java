package practice.sorting;

public class CountingSort {
	 
	private static void countingSort(int [] arr) {
		int n = arr.length;
		int [] sortedArr = new int[n+1];
		int k = 0;
	    for(int i=0; i<n; i++) {
	       if(k<arr[i]) {
	    	   k= arr[i];
	       }
	    }
		int [] auxArr = new int[k+1];
		// Initialize the elements of Aux[] with 0
	    for(int i=0 ; i<=k; i++) {
	    	auxArr[i] = 0;
	    }
	 // Store the frequencies of each distinct element of A[],
	    // by mapping its value as the index of Aux[] array
	    for(int i=0; i<n; i++) {
	    	auxArr[arr[i]]++;
	    }
	    int j = 0;
	    for(int i=0; i<=k; i++) {
	        int tmp = auxArr[i];
	        // Aux stores which element occurs how many times,
	        // Add i in sortedA[] according to the number of times i occured in A[]
	        while(tmp!=0) {
	            //cout << Aux[i] << endl;
	        	sortedArr[j] = i;
	            j++;
	        }
	    }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {6,7,2,1,9,4};
		countingSort(arr);
		for (int i : arr) {
			System.out.println(i);
	}

	}

}
