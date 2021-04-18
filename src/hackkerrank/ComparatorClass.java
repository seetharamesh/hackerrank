package hackkerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//Comparator interface is very useful if we have to sort by multiple fields in a user designed class. The sort method of collections class 
//takes List and comparator as args and sorts according to that comparator. So we need seperate classes for user defined comparator class
// to override compare method.

class Employee{
	int id;
	String ename;
	int age;
	//constructor
	Employee(int id,String ename,int age){
		this.id = id;
		this.ename = ename;
		this.age = age;
	}
	
}

class AgeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.age > e2.age) return 1;
		else if(e1.age < e2.age) return -1;
		else return 0;
	}
}

class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.ename.compareTo(e2.ename) > 0)return 1;
		else if(e1.ename.compareTo(e2.ename) < 0) return -1;
		else return 0;
	}
}

/* Another option for  NameCompartor. This class provides comparison logic based on the name. 
 * In such case, we are using the compareTo() method of String class, which internally provides the comparison logic. 
 * 
 * class NameComparator implements Comparator<Employee>{  
	public int compare(Employee e1,Employee e2){  
	return e1.name.compareTo(e2.name);  
	}  
 * 
 * */
//comparator class for sorting by age and name
class NameAgeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.age == e2.age)
			return e1.ename.compareTo(e2.ename);
		else return e1.age - e2.age;
	}
	
}

public class ComparatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new Employee(106, "Millen",23));
		arr.add(new Employee(101, "Butler",23));
		arr.add(new Employee(105, "Aaron",23));
		arr.add(new Employee(102, "Mills",26));
		arr.add(new Employee(108, "Jan",26));
		Collections.sort(arr, new AgeComparator()); //sorting by age
		
		for(Employee e: arr) {
			System.out.println(e.id + " " + e.ename + " " + e.age);
		}
		System.out.println("**************");
		Collections.sort(arr, new NameComparator());//sorting by name
		
		for(Employee e: arr) {
			System.out.println(e.id + " " + e.ename + " " + e.age);
		}
		
		System.out.println("************");
		Collections.sort(arr, new NameAgeComparator());//sort by age and name
		for(Employee e: arr) {
			System.out.println(e.id + " " + e.ename + " " + e.age);
		}

	}

}

