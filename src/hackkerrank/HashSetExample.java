package hackkerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of pairs:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> hs = new HashSet<>(n);
		String[] str1 = new String[n];
		String[] str2 = new String[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter %dth pair of strings:\n", i);
			str1[i] = sc.next();
			str2[i] = sc.next();
		}
		sc.close();
		for (int j = 0; j < n; j++) {
	        hs.add(str1[j] + " " + str2[j]);
	        System.out.println(hs.size());
	    }
	}
}
