package hackkerrank;

import java.math.*;
import java.util.*;

public class Primality {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger b1;
        b1 = new BigInteger(n);
        //Refer to documentation -- certainty (the argument that is passed to isProbablePrime below) - 
        //a measure of the uncertainty that the caller is willing to tolerate: if the call returns true the probability 
        //that this BigInteger is prime exceeds (1 - 1/2^certainty). The execution time of this method is proportional 
        //to the value of this parameter.
        boolean b = b1.isProbablePrime(1);
        if(b) System.out.println("prime");
        else System.out.println("not prime");
        scanner.close();
    }
}
