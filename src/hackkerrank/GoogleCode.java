package hackkerrank;

import java.util.Scanner;
import java.util.Stack;

public class GoogleCode {
	static void generatePrime(int n, int p) {
		int givennum = n;
		Stack<Integer> sint = new Stack<>();
		for(int i = 2; i <= n; i++) {
			while(n % i == 0) {
				sint.add(i);
				n = n/i; 		
			}
		}
		System.out.println(sint);
		if(sint.size() >= p) {
			givennum = (int) givennum - (sint.get(p-1));
			System.out.println("new n is: " + givennum);
			generatePrime(givennum,p);//generate until n < p
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Input the number of testcases: ");
//		int testcase = sc.nextInt();
//		while(testcase >= 0)
//		{
//			System.out.println("Input the number N: ");
			int n = sc.nextInt();
//			System.out.println("Input P: ");
			int p= sc.nextInt();
			generatePrime(n, p);
//			testcase --;
//		}
	}
	}
