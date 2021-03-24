package hackkerrank;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

class Printer
{
   //Write your code here
	public void printArray(Object obj){
		if(obj instanceof String[]) {
			//System.out.println(Arrays.toString((String[])obj));
			for (String str : (String[]) obj) {
	            System.out.print(str + " " + "\n");
	        }
		}
		else if(obj instanceof Integer[]) {
			//System.out.println(Arrays.toString((Integer[]) obj));
			for (Integer num : (Integer[]) obj) {
	            System.out.print(num + " " + "\n");
	        }
		}
	}
 
}

public class GenericsExample {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}