package practice;

public class ShiftInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-5,3,-9,1,-1};
		for(int i=0; i<5;i++) {
			for(int j=i; j<4  ; j++) {
				if(a[j]>=0&&a[j+1]<0) {
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
		}
		
		for (int i : a) {
			System.out.print(i);
		}

	}

}
