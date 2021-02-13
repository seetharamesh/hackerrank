package hackkerrank;
import java.util.Scanner;

public class Stdin_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            //Note: minus indicates left indentation. 15 indicates field's minimum length. s represents string.
            //0 represends padding with 0. 3 represents fields minimum length. %n represents newline.
        }
        sc.close();
        System.out.println("================================");	
	}

}
