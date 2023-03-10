package Array;

public class Array_Impl {

	public static void main(String[] args) {
		double sum=0;

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("array elements are = "+arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println("sum of array element are = "+sum);

		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}	
		}
		System.out.println("max elements are = "+max);
	}

}
