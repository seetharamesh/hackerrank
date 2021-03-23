package hackkerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get from user n and n lines, with each line containing count followed by numbers specific to count 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int n = sc.nextInt();
		System.out.println("List the lines..each line followed by count and number of count items");
		ArrayList[] arr = new ArrayList[n];
		int c ;
		for(int i = 0 ; i < n; i++) {
			 c = sc.nextInt();
			 arr[i] = new ArrayList();
		for(int j = 0 ; j < c ; j++)
			arr[i].add(sc.nextInt());
	}
	
	//accept number of queries from user 
	System.out.println("Enter number of queries:");
	int q = sc.nextInt();
	for(int k = 0; k<q ; k++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		try{
			System.out.println(arr[x-1].get(y-1));//remember in problem it says from xth line get yth position. He indicates x as first line
		}
		catch(Exception e)
		{
			System.out.println("Error!");
		}
	}
	}
}
