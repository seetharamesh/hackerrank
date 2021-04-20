package hackkerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingPeople {
	
	public static void main(String[] args) {
		//1. add given array to list
		//2. create a hashmap to store key, value pairs
		//3. using stream and distinct seperate the distinct values and store them in seperate list
		//4. Take each distinct element and find all the keys to it and store in seperate list called biggroup
		//5. loop through the big group to break into individual groups according to distinct elem value. store them in seperate list
		//6. combine the lists to one big final list
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(4);
		
		
		Map<Integer,Integer> m = new HashMap<>();
		for(int i = 0; i < list.size(); i++) {
			m.put(i, list.get(i));
		}
		//traverse a map to print
//		for(Map.Entry map: m.entrySet())
//			System.out.println(map.getKey() + " " + map.getValue());
		//System.out.println("******distinct begin*******");
		
		//create a list to create distinct values
		List<Integer> distinctelems = list.stream().distinct().collect(Collectors.toList());
		//System.out.println(distinctelems);
		//System.out.println("*********distinct end*******");
		
		int count=0;
		List<List<Integer>> finalgroup = new ArrayList<>();
		
		for(int i = 0; i < distinctelems.size(); i++) {
			int splitgrouplen = distinctelems.get(i);
			System.out.println("splitgrouplen:" + splitgrouplen);
			Map<Integer,Integer> biggroup = new HashMap<>();
			
			for (Map.Entry key : m.entrySet()) {
		        if (key.getValue().equals(splitgrouplen)) {
		             biggroup.put((Integer) key.getKey(),splitgrouplen);
		        }
			}
			
//			System.out.println("Big group:");
//			System.out.println(biggroup);
//			//System.out.println("Split group len: " + splitgrouplen);
			List<Integer> indigroup = new ArrayList<>();
			
		for (Map.Entry key : biggroup.entrySet()) {
	        	++count;
	        if(count > splitgrouplen) {
	        	//System.out.println("count inside..."+count);
	        	//System.out.println(indigroup);
	        	finalgroup.add(indigroup);
	        	System.out.println("final:" +finalgroup);
	        	//indigroup.clear();
	        	//count = 0;
	        	indigroup = new ArrayList();
	        	indigroup.add((Integer) key.getKey());
	        	count = 1;
	        	//System.out.println(indigroup);
	        	//System.out.println(finalgroup);
	        }
	        else {
	    		//System.out.println("count:" + count);
	        	indigroup.add((Integer) key.getKey());
	    		//System.out.println(indigroup);
	        }
		}//end of for
		//System.out.println(indigroup);
		//System.out.println("final2:" +finalgroup);//prints empty
		finalgroup.add(indigroup);
		System.out.println("final groups are:");
		System.out.println(finalgroup);
		//System.out.println(indigroup);

		System.out.println("\n"); 
		count = 0;
		}//end of outermost for loop
	}
	
}

		
		
		
		
	


