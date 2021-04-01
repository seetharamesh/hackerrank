package hackkerrank;

import java.io.*;
import java.util.*;

/*The first line contains an integer,  (the number of test cases).
The  subsequent lines each describe a test case in the form of  space-separated integers:
The first integer specifies the condition to check for ( for Odd/Even,  for Prime, or  for Palindrome). 
The second integer denotes the number to be checked.*/

interface PerformOperation {
 boolean check(int a);
}


class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 
 public static PerformOperation isOdd() {
	 // return  if a number is odd or  if it is even.
	 return (int a) -> a % 2 != 0;
 }
 
public static PerformOperation isPrime() {
	return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
 }

public static PerformOperation isPalindrome() {
	return (int a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
}
}

   // Write your code here

public class LambdaExample {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
