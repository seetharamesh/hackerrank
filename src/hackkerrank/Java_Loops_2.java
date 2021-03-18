package hackkerrank;

import java.util.Scanner;

public class Java_Loops_2 {

		public static void main(String[] argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	         int fs = (int) (a + Math.pow(2,0)*b);
	            System.out.print(fs);
	            int ns = fs;
	                
	            for(int s=1;s<=n-1;s++){
	                 ns = ns + (int) (Math.pow(2, s)*b);
	                System.out.print(" " + ns);
	            }
	            System.out.println();
	      
	      
	        }
	        in.close();
	    }

	}


