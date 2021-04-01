package hackkerrank;

import java.util.*;

class StudentSort{
	private int id;
	private String fname;
	private double cgpa;
	public StudentSort(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class SortExample
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<StudentSort> studentList = new ArrayList<StudentSort>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			StudentSort st = new StudentSort(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		//sort students with CGPA first in descending order. If 2 CGPA's are same then sort by names descendingly. If names are same, sort descending by id
		Collections.sort(studentList,  Comparator.comparing(StudentSort :: getCgpa).reversed().
	              thenComparing(StudentSort :: getFname).thenComparing(StudentSort :: getId));
		
		
      	for(StudentSort st: studentList){
			System.out.println(st.getFname());
		}
	}
}