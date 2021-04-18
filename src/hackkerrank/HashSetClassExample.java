package hackkerrank;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("Three");
		hs.add("Four");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
