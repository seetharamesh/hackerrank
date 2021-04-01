package hackkerrank;
import java.io.*;

public class JunitExample {

	int add(int a, int b) {
		System.out.println("inside add");
		return (a+b);
	}
	
	int subtract(int a, int b) {
		System.out.println("inside subtract");
		return (a-b);
	}
	public static void main (String[] args) throws java.lang.Exception
	  {
		JunitExample ju = new JunitExample();
		System.out.println(ju.add(2,3));
		System.out.println(ju.subtract(6, 5));    
	}
}
	

