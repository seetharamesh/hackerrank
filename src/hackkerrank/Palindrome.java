package hackkerrank;

import java.util.Scanner;

public class Palindrome {

public static void main(String[] args) {
// TODO Auto-generated method stub
String s = "madam12";
StringBuilder sb = new StringBuilder(s);
System.out.println("original string is:" + sb);
StringBuilder copy = new StringBuilder();
copy.append(sb);
StringBuilder rev = new StringBuilder();
rev = sb.reverse();
System.out.println("reverse string is:" + rev);
System.out.println("copy is: " + copy) ;
if (String.valueOf(copy).equals(String.valueOf(rev))) System.out.println("Yes");
else System.out.println("No");
}
}
