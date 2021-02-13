package hackkerrank;
import java.util.Scanner;
public class JavaEOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
	    while(sc.hasNext()){
	        String sor=sc.nextLine();
	        System.out.println(++num + " " + sor);
	    }

	}

}
