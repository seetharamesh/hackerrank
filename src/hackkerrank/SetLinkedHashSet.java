package hackkerrank;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetLinkedHashSet {

	public static void main(String[] args) {
		//creating a list collection to add it to Set 
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(10);
		list.add(null);
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(10);
		set1.add(30);
		set1.add(40);
		
		//now let us see how union operation is done between list and set1
		list.addAll(set1);
		System.out.println(list); //[5,8,10,10,null,10,30,40]
	
		//let us add list to set and see
//		set1.addAll(list);
//		System.out.println(set1);//[10,30,40,5,8,null]
		
//		//now lets see how intersection operation is done using retainAll.If retainAll is used in set and another collection then the elements are 
		//retained in set
//		set1.retainAll(list);
//		System.out.println(set1);//[10,30,40]
//		
//		list.retainAll(set1);
//		System.out.println(list);

		
//		Set<Integer> set = new LinkedHashSet<>();
//		set.addAll(list);
//		System.out.println(set);//will print only unique elements [5,8,10,null]
//		set.remove(null);
//		System.out.println(set); //[5,8,10]
//		set.clear();
//		System.out.println(set);//[]
//		
//		System.out.println("*********");
//	
//		
//		list.retainAll(set1);
//		System.out.println(list);//[10,10]
		
				
	}

}
