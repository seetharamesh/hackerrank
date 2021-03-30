package hackkerrank;
import java.util.Scanner;

public class Anagrams {	
	 static boolean isAnagram(String a, String b) {
	        // Complete the function
		 char arr[]=a.toLowerCase().toCharArray();  
	        char barr[]=b.toLowerCase().toCharArray();
	        java.util.Arrays.sort(arr);
	           java.util.Arrays.sort(barr);

	           return java.util.Arrays.equals(arr,barr);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
