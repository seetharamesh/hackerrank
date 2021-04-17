package hackkerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//lets create custom class to use compareTo
class StudentComparator implements Comparable<StudentComparator>{
	int id;
	String name;
	int age;
	//constructor
	StudentComparator(int id,String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	@Override
	//compareTo for age
	public int compareTo(StudentComparator s) {
		if(this.age > s.age) return 1;
		else if(this.age < s.age) return -1;
		else return 0;
	}
	
}

public class ComparableClass{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "seetha";
		String str2 = "Seetha";
		int ret = str1.compareTo(str2);
		System.out.println(ret);//output 32. if > 0 then str1 > str2
		
		StudentComparator s1 = new StudentComparator(1000, "Max",17);
		StudentComparator s2 = new StudentComparator(1003, "Ruby",29);
		
		int result = s1.compareTo(s2);
		if (result > 0) System.out.println("Max age is greater than Ruby");
		else System.out.println("Ruby age is greater than Max");
		
		//create arraylist
		ArrayList<StudentComparator> arr = new ArrayList<>();
		arr.add(new StudentComparator(1002,"Miller",18));
		arr.add(new StudentComparator(1008,"Smith",32));
		arr.add(new StudentComparator(1007,"Abby",43));
	
		Collections.sort(arr);
		for(StudentComparator s: arr)
			System.out.println(s.id + " " + s.name + " " + s.age);

	}

}
