package hackkerrank;

import java.util.ArrayList;
import java.util.List;

/*Write a function that accepts a sequence of unique integers in any order between 0 and 9 (inclusive), and returns the missing element.*/

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<>();
		num.add(7);
		num.add(1);
		//num.add(2);
		num.add(8);
		num.add(5);
		//num.add(4);
		//num.add(6);
		num.add(0);
		num.add(3);
		//num.add(9);

		
		
		for(int i = 0 ; i <= 9; i++) {
			if(!num.contains(i)) {
				System.out.println("element " + i + " not found");
			}
		}

	}

}
