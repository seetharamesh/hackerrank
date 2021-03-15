package hackkerrank;
import java.util.*;
public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create ArrayList with elements
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(500);
		list.add(5000);
		list.add(50);
		list.add(50000);
		list.add(5);
		Set<Integer> s = new HashSet<Integer>(); //create HashSet using Set interface
		s.addAll(list);//automatically duplicates are removed when arraylist is added to set
//		System.out.println("List contains:" + list);
//		System.out.println("Set contains:" + s);
		//add logic to only return duplicates
		
		//to add the set back to list... clear list and add set to it.
		if(list.size() > s.size()) {
			//meaning duplicate exists in list
			list.clear();
			list.addAll(s);
		}
		else {
			//no duplicates
			list = null;
		}
		
		List<Integer> output = list;
        if (output != null){
            Collections.sort(output);
            for(int i = 0; i < output.size(); i++){
                System.out.print(output.get(i));
                if (i != output.size() - 1){
                    System.out.print(" ");
                }
            }
        }
        else {
            System.out.print("no duplicates");
        }
	}

}
