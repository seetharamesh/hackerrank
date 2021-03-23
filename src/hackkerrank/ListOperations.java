package hackkerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {

	public static void main(String[] args) {
		//first get number of elements in the list
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want in list:");
		int n = sc.nextInt();
		//next get all the n integers and store in list
		List<Integer> list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter now element %d: \n", i);	
			list.add(sc.nextInt());
		}
		System.out.println("User original list is: " + list);
		//get number of queries
		System.out.println("Enter number of queries: ");
		int q = sc.nextInt();
		String str;
		//get specifications of operations for each query to be performed on list
		for(int j = 0; j < q ; j++) {
			System.out.printf("Enter query # %d \n" , j);
			 str = sc.next();
			 if(str.equalsIgnoreCase("Insert")) {
				 System.out.println("Inside insert");
				 int x = sc.nextInt(); //get index position to insert
				 int y = sc.nextInt(); //get what to insert
				 list.add(x, y);
				 System.out.println("The list is now modified as: " + list);
			 }
			 if(str.equalsIgnoreCase("Delete")) {
				 System.out.println("Inside delete");
				 int x = sc.nextInt(); //get the index position where element is to be removed
				 list.remove(x);
				 System.out.println("The list is modified as: " + list);
			 }
		}
		/* Print our updated  List. Printing by this way will eliminate [] (brackets around the list).
		 * If we print as list it shows brackets around */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
		}
	}
