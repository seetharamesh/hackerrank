package hackkerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodScorer {

	public static void main(String[] args) {
		//Enter number of test cases
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of testcases:");
		int testcases= sc.nextInt();
		
		//int count = 0;
		int[] col = new int[2];
		int total = 0;
		int greaterscore = 0;
		int greatestcol=0;

		while(testcases > 0) {
		System.out.println("Enter the size of c1 and c2 column");
		int colsize1 = sc.nextInt();
		int colsize2 = sc.nextInt();
		col[0] = colsize1;
		col[1] = colsize2;
		//++count;
		--testcases;
		
	
	
			
		
		for(int i = 0; i < 2; i ++) {//only 2 cols
			//enter scores for each columns		
			for(int j = 0; j< col[i]; j++) {
				//enter scores for that columns
				System.out.println("Enter the scores");
				int scores = sc.nextInt();
				 total = total + scores;	
				 System.out.println(total);
			}
			if(total > greaterscore) {
				 greaterscore= total;
				 greatestcol = i;	
				 System.out.println("greatest col:" + greatestcol);
			}
			total = 0;
		}
		if(greatestcol == 0)
		System.out.println("Highest score is " + greaterscore + " greatest col is: C1");
		else 
		System.out.println("Highest score is " + greaterscore + " greatest col is: C2");	

		}//end of testcases loop
	}

}
