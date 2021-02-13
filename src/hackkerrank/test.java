package hackkerrank;
import java.io.*;

public class test {

	public static void main (String[] args) throws java.lang.Exception
	  {

		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    String num = br.readLine(); //read the first input
			int n = Integer.parseInt(num);//convert string to int
			
		    String str = br.readLine();//read the next input
		   
			for(int i = 0; i < n; i++) //loop through and print the string
				System.out.println(str);
		
		    
		  }
		}
	

