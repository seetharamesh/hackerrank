package hackkerrank;
import java.util.*;
import java.io.*;

public class StringPuzzle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string A");
        String A=sc.next();
        System.out.println("Enter string B");
        String B=sc.next();
        int sizeA = A.length();
        int sizeB = B.length();
        int sum = sizeA  + sizeB;
        //the strings are composed of lower case characters only.
        char c ='h';
	     int asciivalue = c;
	     String s ="";
	     boolean flag = false;
	     int count = 0;
	     
        for(int i = 0; i < sizeA; i++) {
        	int asciivalueOfA = A.charAt(i);
        	if(flag)break;
      	for(int j = i; j< sizeB; j++) {
      		int asciivalueOfB = B.charAt(j);
      		if(asciivalueOfA == asciivalueOfB) {
      			break;
      		}
      		if(asciivalueOfA > asciivalueOfB) {
      			s = "Yes";
      			flag = true;
      			break;
      		}
      		else {
      			s = "No";
      			flag=true;
      			break;
      		}     		
      	}
        }
        if(flag)
        System.out.println(s);
        else {
        	if(sizeA <= sizeB)
        	System.out.println("No");
        	else
        		System.out.println("Yes");
        }
        //capitalize the first letters of both words and print in one line
        String output1 = A.substring(0, 1).toUpperCase() + A.substring(1) ;
        String output2 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(output1 + " " + output2);


	}

}
