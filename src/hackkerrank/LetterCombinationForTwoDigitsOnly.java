package hackkerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//This code will work for not more than 2 digits
/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the 
 * number could represent. Return the answer in any order.A mapping of digit to letters (just like on the 
 * telephone buttons) is given below. Note that 1 or 0 does not map to any letters.
 * */

public class LetterCombinationForTwoDigitsOnly {

	public static void main(String[] args) {
		//given a string of numbers(2-9 inclusive)
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.contains("1") || str.contains("0")){
			System.out.println("1 or 0 not valid");
			System.exit(0);
		}
		
		char[] c = str.toCharArray();//convert string to char array
		List<String> list = new ArrayList<>();
		Queue<String> qstr = new PriorityQueue<>();
				
		String[] code = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int[] charint = new int[c.length];
		String[] loopstr = new String[c.length];
			
		for(int i = 0; i < c.length; i++) {
			charint[i] = Integer.parseInt(String.valueOf(c[i]));//char is converted to original int value (not ascii)
			loopstr[i] = code[charint[i] - 2];//extracting the code for that char int
			//System.out.println(loopstr[i]);
			qstr.add(loopstr[i]);
		}
		System.out.println("Queue size: " + qstr.size());
		String first="",second="",appendstring="";
		int qsize = qstr.size();
		for(int q=0; q < qsize;q++) {
			System.out.println("hellllo");
			 first = qstr.remove();
			 --qsize;
			System.out.println(first);
			if(qstr.peek() != null) {
				 second = qstr.remove();
				 System.out.println(second);
				 --qsize;
			}
			else {
				for(int i=0;i<first.length();i++) {
					appendstring= String.valueOf(first.charAt(i));
					list.add(appendstring);
				}
			}
			for(int i = 0; i < first.length();i++) {
			for(int j = 0; j < second.length();j++) {
				//String appendstring = "\""+first.charAt(i)+second.charAt(j)+"\"";
				 appendstring = String.valueOf(first.charAt(i))+ second.charAt(j);

				System.out.println(appendstring);
				list.add(appendstring);
			}
			System.out.println(list);
		}
			System.out.println("queue size becomes: " + qsize);
			
		}
		
		
		
		
		
		
//		String first = loopstr[0];
//		String second = loopstr[1];
//		for(int i = 0; i < first.length();i++) {
//			for(int j = 0; j < second.length();j++) {
//				String appendstring = "\""+first.charAt(i)+second.charAt(j)+"\"";
//				//System.out.println(appendstring);
//				list.add(appendstring);
//			}
//		}
//		for(int i = 0; i < list.size();i++)
//			System.out.println(list.get(i));
	}

}
