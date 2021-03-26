package hackkerrank;

import java.io.*;
import java.util.*;

public class TryCatchException1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        try {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;
            System.out.println(z);            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);  
        }
        catch(InputMismatchException e) {
        System.out.println("java.util.InputMismatchException");//the reason this is added instead of "e" is because the requirement has this way to be output if x and y are 2147483648
        
    }

    }
}
