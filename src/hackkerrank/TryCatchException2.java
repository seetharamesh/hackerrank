package hackkerrank;

import java.util.Scanner;
class Calc {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int n, int p) throws Exception {//use throws when exceptions are thrown from methods or block of code
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
             long result=(long)Math.pow(n,p);
             return result;
}
}


public class TryCatchException2 {
    public static final Calc my_calculator = new Calc();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}