package hackkerrank;
import java.util.*;

public class StdIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine(); //adding this because when we press enter key to enter the string, the compiler considers the enter key as string.
	        String s = scan.nextLine();
	       
	        
	        scan.close();
	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);

	}

}
