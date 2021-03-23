package hackkerrank;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get n from user and all the n numbers
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		int count = 0;
//		int initialSum = 0;
//		for(int i = 0; i < n; i++) {
//			int val = sc.nextInt();
//			if(val < 0) {
//				++count;
//			}
//			if(n > 2)
//			initialSum+=val;
//			arr[i] = val;
//		}
//		if(initialSum < 0) ++count;
//		sc.close();
//		System.out.println("Initial count: " + count);
//		int sum = 0;
//		for(int j = 0; j< n; j++) {			
//			for(int k = j+1; k <= n-1 ; k++) {
//				sum = arr[j] + arr[k];
//				if(sum < 0) {
//					System.out.printf("arr[%d] + arr[%d] = %d \n", j,k,sum);
//					
//					++count;
//				}
//			}
//			
//		}
//		System.out.println("Number of negative sums: " + count);
//
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int[] array1= new int[n];
	    for(int i=0;i<n;i++){
	        array1[i]=sc.nextInt();
	    }
	    int count=0;
	    for(int j=0;j<n;j++){
	        int sum=0;
	        for(int k=j;k<n;k++){
	            sum=array1[k]+sum;
	            if(sum<0){
	                count++;
	            }
	        }
	    }
	    System.out.println(count);
	}

}
