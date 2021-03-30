package hackkerrank;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get inputs -- 6 lines with 6 integers between -9 and 9 (inclusive)
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for(int rows = 0 ; rows < 6; rows++){
			for(int cols = 0; cols < 6; cols++) {
				arr[rows][cols]  = sc.nextInt();
			}
		}

	}

}
